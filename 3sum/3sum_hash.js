/*
 * @lc app=leetcode id=15 lang=javascript
 *
 * [15] 3Sum
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
  let map = new Map();
  let result = [];
  //make no sense if less than 3 element
  if (nums.length < 3) {
    return result;
  }
  // sort to avoid...
  nums.sort((a, b) => a - b);
  //put index in a map
  for (let i = 0; i < nums.length; i++) {
    map.set(nums[i], i);
  }
  //check difference
  for (let i = 0; i < nums.length; i++) {
    //avoid sortted element has duplicate nums[i]
    if (i != 0 && nums[i] == nums[i - 1]) continue;
    for (let j = i + 1; j < nums.length; j++) {
      if (j != i + 1 && nums[j] == nums[j - 1]) continue;
      if (
        map.has(0 - nums[i] - nums[j]) &&
        map.get(0 - nums[i] - nums[j]) > j
      ) {
        result.push([nums[i], nums[j], 0 - nums[i] - nums[j]]);
      }
    }
  }
  return result;
};
// @lc code=end
