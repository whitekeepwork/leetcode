/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function(nums, k) {
  counter = 0;
  hashtable = {};
  hashtable[0] = 1;
  sum = 0;
  for (let i = 0; i < nums.length; i++) {
    sum = sum + nums[i];
    if (sum - k in hashtable) {
      counter += hashtable[sum - k];
    }
    if (sum in hashtable) {
      hashtable[sum] += 1;
    } else {
      hashtable[sum] = 1;
    }
  }
  return counter;
};
