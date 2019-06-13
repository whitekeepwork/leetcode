/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum one way map approachment 
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //intialized the map for storing index and value
        Map<Integer,Integer> table = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int dis = target - nums[i];
            //check whether dis exist before and get index (value in the has map, key is the dis)
            if (table.containsKey(dis)) {
                return new int[] {table.get(dis), i};
            }  
            table.put(nums[i],i);
        }
        throw new IllegalArgumentException("no result");
    }
}



