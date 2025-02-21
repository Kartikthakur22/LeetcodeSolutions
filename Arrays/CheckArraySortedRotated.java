/*
Leetcode 1752 - Check if array is sorted and rotated
Given an array nums, return true if the array was originally sorted in non-decreasing order,
then rotated some number of positions (including zero). Otherwise, return false.

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.

nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.
*/

public class CheckArraySortedRotated {
    public boolean check(int[] nums){
        int n=nums.length;
        int c=0;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                c++;
            }
        }
            if(nums[n-1]>nums[0]){
                c++;
            }
        return c<=1;
    }
}
