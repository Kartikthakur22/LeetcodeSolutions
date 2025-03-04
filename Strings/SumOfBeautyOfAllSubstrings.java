/*
Leetcode 1781
 The beauty of a string is the difference in frequencies between the most frequent and least frequent characters.
For example, the beauty of "abaacc" is 3 - 1 = 2.
Given a string s, return the sum of beauty of all of its substrings.

Input: s = "aabcb"
Output: 5
Explanation: The substrings with non-zero beauty are ["aab","aabc","aabcb","abcb","bcb"], each with beauty equal to 1.
 */
package Strings;

public class SumOfBeautyOfAllSubstrings {
    public int beautySum(String s) {
        int n=s.length(),ans=0;
        for(int i=0;i<n;i++){
            int[] freq=new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        max=Math.max(freq[k],max);
                        min=Math.min(freq[k],min);
                    }
                }
                ans+=max-min;
            }
        }
        return ans;
    }
}
