/*
Leetcode 169
 Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int c=0;
        int v=0;
        for(int i=0;i<nums.length;i++){
            if(v==0){      //if votes are zero make element the candidate
                c=nums[i];
            }
            if(nums[i]==c){  //if candidate is the element,increment votes
                v++;
            }
            else{       //if candidate is not the element,decrement votes
                v--;
            }
         }
        return c;
    }
}
