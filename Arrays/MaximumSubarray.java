/*
 Leetcode 53
 Given an integer array nums, find the subarray
 with the largest sum, and return its sum.

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxi=Math.max(sum,maxi);
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}
