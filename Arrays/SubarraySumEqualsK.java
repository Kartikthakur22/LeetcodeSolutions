/*
 Leetcode 560
 Given an array of integers nums and an integer k,
 return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.


Input: nums = [1,1,1], k = 2
Output: 2
 */
import java.util.HashMap;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int c=0,s=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        for(int a:nums){
            s+=a;  //calculating prefix sum
            if(hm.containsKey(s-k)){
                c+=hm.get(s-k);   
                }
               hm.put(s,hm.getOrDefault(s,0)+1); //Putting prefix sums into hashmap with value as count of that sum
               }
          return c;
    }
}
