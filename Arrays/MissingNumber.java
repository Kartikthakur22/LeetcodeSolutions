/*leetcode-268
 Given an array nums containing n distinct numbers in the range [0, n],
 return the only number in the range that is missing from the array.
 Input: nums = [3,0,1]
 Output: 2
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2; //Using sum of natural nos formula and subtracting sum of array from it
        for(int i:nums){
            sum-=i;
        }
        return sum;
    }
}
