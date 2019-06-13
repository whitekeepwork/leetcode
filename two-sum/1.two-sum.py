#
# @lc app=leetcode id=1 lang=python3
#
# [1] Two Sum
#
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        for i, num in enumerate(nums):
            dis =  target - num
            if dis not in map:
                map[num] = i
            else:
                return[map[dis],i]

