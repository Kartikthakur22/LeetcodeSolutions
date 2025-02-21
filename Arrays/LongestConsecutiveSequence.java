/*
 Leetcode 128
 Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 */

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int longest=1;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){   //Adding all elements to hashset
            s.add(nums[i]);  
        }
        for(int it:s){
            if(!s.contains(it-1)){   //Check if element smaller by one is not present
                int cnt=1;      //Start counting the sequence until valid
                while(s.contains(it+1)){
                    cnt++;
                    it=it+1;
                }
            longest=Math.max(longest,cnt);   //Calculating longest sequence
            }
            if(longest>n/2){
                break;
            }
        }
        return longest;
    }
}
