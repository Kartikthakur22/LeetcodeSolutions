/*
Leetcode-18
 Given an array nums of n integers, return an array
 of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

Example 2:
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FourSum{
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        if(n<4){
            return ans;
            }
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
                }
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                    }
                int k=j+1;
                int l=n-1;
                while(k<l){
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        List<Integer> t=new ArrayList<>();
                        t.add(nums[i]);
                        t.add(nums[j]);
                        t.add(nums[k]);
                        t.add(nums[l]);
                        ans.add(t);
                        l--;
                        k++;
                        while(k<l && nums[l]==nums[l+1]){
                            l--;
                            }
                         while(k<l && nums[k]==nums[k-1]){
                            k++;
                            }
                        }
                    else if(sum>target){
                        l--;
                        }
                    else{
                        k++;
                        }
                    }
                }
            }
        return ans;             
    }
}
