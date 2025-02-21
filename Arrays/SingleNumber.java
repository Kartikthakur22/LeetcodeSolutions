/*
Leetcode-136
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Input: nums = [4,1,2,1,2]
Output: 4
 */

class SingleNumber{
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i:nums){
            ans^=i;
            }
        return ans;
    }
}