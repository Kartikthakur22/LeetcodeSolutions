/*
 Given an integer array nums, find a subarray
 that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
 */
class MaximumProductSubarray{
    public int maxProduct(int[] nums) {
        int l=1,r=1,ans=nums[0];
        int n=nums.length;
        for(int i=0;i<n;i++){
            l=l==0?1:l;
            r=r==0?1:r;
            l*=nums[i];
            r*=nums[n-i-1];
            ans=Math.max(ans,Math.max(l,r));
            }
        return ans;
    }
}