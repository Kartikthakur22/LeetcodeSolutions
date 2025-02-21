/*
 Leetcode 1
 Given an array of integers nums and an integer target,
 return indices of the two numbers such that they add up to target.
 Input: nums = [2,7,11,15], target = 9
 Output: [0,1]
 Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]
 */
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int c=target-nums[i]; //Checking if compliment which is (target-element) is present or not
            if(hm.containsKey(c)){
                return new int[]{hm.get(c),i};
            }
            hm.put(nums[i],i); //Storing elements in hashmap with their index
        }
        return new int[]{};
    }
}
