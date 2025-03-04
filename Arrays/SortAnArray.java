/*
 Given an array of integers nums, sort the array in ascending order and return it.
You must solve the problem without using any built-in functions in O(nlog(n)) time complexity
and with the smallest space complexity possible.

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
 */

import java.util.ArrayList;

public class SortAnArray {
    public int[] sortArray(int[] nums) {
        ms(0,nums.length-1,nums);
        return nums;
    }
    public void ms(int l,int h,int[] nums){
        if(l<h){
            int m=(l+h)/2;
            ms(l,m,nums);
            ms(m+1,h,nums);
            merge(l,m,h,nums);
        }
    }
    public void merge(int l,int m,int h,int[] nums){
        ArrayList<Integer> ans=new ArrayList<>();
        int i=l,j=m+1;
        while(i<=m && j<=h){
            if(nums[i]>nums[j]){
                ans.add(nums[j++]);
            }
            else{
                ans.add(nums[i++]);
            }
        }
        while(i<=m){
            ans.add(nums[i++]);
        }
        while(j<=h){
            ans.add(nums[j++]);
        }
        for(int x=l;x<=h;x++){
            nums[x]=ans.get(x-l);
        }
    }
}
