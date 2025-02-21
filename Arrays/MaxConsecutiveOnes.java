/*
 Leetcode-485 Max consecutive ones
 Given a binary array nums, return the maximum number of consecutive 1's in the array.

Input: nums = [1,1,0,1,1,1]
Output: 3
*/

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                res=Math.max(res,count);
            }
            else{
                count=0;
            }
        }
        return res;
    }
}
