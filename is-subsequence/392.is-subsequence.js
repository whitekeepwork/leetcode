/*
 * @lc app=leetcode id=392 lang=javascript
 *
 * [392] Is Subsequence
 */

// @lc code=start
/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isSubsequence = function(s, t) {
  if (s.length == 0) {
    return true;
  }
  let i = 0;
  let j = 0;
  while (i < s.length && j < t.length) {
    if (s[i] != t[j]) {
      j++;
    } else {
      i++;
      j++;
    }
  }
  return i == s.length;
};
// @lc code=end
