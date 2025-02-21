/*
 Leetcode 283 Move Zeroes
 Given an integer array nums, move all 0's to the end of it while 
 maintaining the relative order of the non-zero elements.
 Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
 */

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int nonZero=0;
        for(int i:nums){
            if(i!=0){   //First put only those elements into array which are non-zero
                nums[nonZero]=i; 
                nonZero++;
                }
            }
        while(nonZero<nums.length){ //Then put 0 to all remaining indexes
            nums[nonZero]=0;
            nonZero++;
            }
    }
}
