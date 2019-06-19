/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s==null || s.length()==0){
            return 0;
        }
        int leftIndex = 0, rightIndex = 0, length = s.length();
    // only 128 character is sc2
    boolean [] table =  new boolean[128];
    int max = 0;

    //loop through the whole string s
    while (rightIndex < length){
        if (table[s.charAt(rightIndex)]==false){
            table[s.charAt(rightIndex)] = true;
            rightIndex++;
        }else{
            max = Math.max(max,rightIndex-leftIndex);
            while (leftIndex < rightIndex && s.charAt(leftIndex) != s.charAt(rightIndex)){
                table[s.charAt(leftIndex)] = false;
                leftIndex++;
            }
            leftIndex++;
            rightIndex++;
        }
    }
    max = Math.max(max, rightIndex - leftIndex);
    return max;
    }
}

