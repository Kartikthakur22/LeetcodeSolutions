/*
 Leetcode 26-Remove duplicates from sorted array
 Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 */

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int j=1; 
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){ //If the element is not equal to its previous element than put it into the array
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
