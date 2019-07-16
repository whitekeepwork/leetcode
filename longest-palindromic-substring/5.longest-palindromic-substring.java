/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 * here is the solution for expand around center solution
 * with o(n^2) 
 * basiclly find all possible palindromic center first could be just right for
 * a character or in the middle of two identical character (so we have 2n-1 possible)
 * 
 * expand and check for each center whether the expand is palindromic or not
 * if yes and longer than previous one we expand the result substring. we do it
 * for all possible center. each expand process takes o(n) overall take o(n^2)  
 */

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int startIndex = 0, endIndex = 0;
        for (int i = 0;i<s.length();i++){
            // longest length if center in ith character
            int lenInChar = expandLongestLength(s,i,i);
            // longest length if center in the middle of ith and i+1th character
            int lenInMid = expandLongestLength(s,i,i+1);
            // find the longest length palidaromic for i or i and i+1 
            int longestLength = Math.max(lenInChar,lenInMid);

            // compare with previous longest, update or keep previous record
            if (longestLength > (endIndex - startIndex )){
                startIndex = i - (longestLength-1)/2;
                endIndex = i + longestLength/2;
            }
            
        }
        // recall in java the substring endindex is not included so need add 1
        return s.substring(startIndex, endIndex + 1 );
    }

    public int expandLongestLength(String s,int start,int end){
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start -1;
    }
}

