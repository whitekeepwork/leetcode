/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
  majority = 0;
  counter = 0;
  for (let i = 0; i <= nums.length; i++) {
    if (counter === 0) {
      majority = nums[i];
      counter = 1;
    } else if (majority === nums[i]) {
      counter++;
    } else {
      counter--;
    }
  }
  return majority;
};
