/*
Leetcode 2149
 return the array of nums such that the the array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
 */
public class RearrangeElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int p=0,n=1;     //Using p and n as indexes
        for(int a:nums){
            if(a>0){   
                ans[p]=a;
                p+=2;
                }
            else{
                ans[n]=a;
                n+=2;
                }
            }
        return ans;
    }
}
