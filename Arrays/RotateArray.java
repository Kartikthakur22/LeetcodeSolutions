/*
 Leetcode 189
 Given an integer array nums, rotate the array to the right by k steps,
 where k is non-negative.
 Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k%=nums.length;      //To handle cases having k greater than length of array
        reverse(nums,0,nums.length-1); //Reverse the whole array
        reverse(nums,0,k-1);           //Reverse from 0 to k-1 index
        reverse(nums,k,nums.length-1);   //Reverse from k to last index
    }
    public void reverse(int[] nums,int s,int e){
        while(s<e){
        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
            s++;
            e--;
        }
    }
}
