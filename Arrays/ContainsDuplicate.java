/*
Leetcode 217
 Given an integer array nums, return true if any value appears at least twice
 in the array, and return false if every element is distinct.

Input: nums = [1,2,3,1]
Output: true
 */

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        for(int val:nums){
            if(seen.contains(val)){
                return true;
            }
            seen.add(val);
        }
        return false;
    }
}
