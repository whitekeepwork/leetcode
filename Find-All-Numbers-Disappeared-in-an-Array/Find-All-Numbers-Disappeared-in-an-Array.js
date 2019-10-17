/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
  result = [];
  for (let i = 0; i < nums.length; i++) {
    k = nums[i];
    while (k != nums[k - 1]) {
      k = swap(k, nums);
    }
  }
  for (let j = 0; j < nums.length; j++) {
    if (nums[j] != j + 1) {
      result.push(j + 1);
    }
  }
  console.log(nums);
  return result;
};

var swap = function(k, nums) {
  const temp = nums[k - 1];
  nums[k - 1] = k;
  k = temp;
  return k;
};
