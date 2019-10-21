/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxLength = function(nums) {
  hash = [];
  hash[0] = -1;
  let maxlen = 0,
    count = 0;
  for (let i = 0; i < nums.length; i++) {
    count = count + (nums[i] == 1 ? 1 : -1);
    if (count in hash) {
      maxlen = Math.max(maxlen, i - hash[count]);
    } else {
      hash[count] = i;
    }
  }
  return maxlen;
};
