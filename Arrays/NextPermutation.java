/*
Leetcode 31
Given an array of integers nums, find the next permutation of nums.
Input: nums = [1,2,3]
Output: [1,3,2]
*/
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int ind=-1,n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){   //Finding break point where decreasing order breaks
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverse(nums,0,n-1);  //Reverse if no such break point
        }
        else{
            for(int i=n-1;i>ind;i--){   //Swap break point element with just greater element from right side
                if(nums[ind]<nums[i]){
                    swap(nums,ind,i);
                    break;
                }
            }
            reverse(nums,ind+1,n-1);    //Reverse from (breakpoint + 1) index to last
        }
    }
    public void reverse(int[] nums,int i,int j){
        int s=i,e=j;
        while(s<e){
            swap(nums,s,e);
            s++;
            e--;
        }
    }
    public void swap(int[] nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}
