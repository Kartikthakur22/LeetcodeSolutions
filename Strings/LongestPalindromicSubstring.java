/*
 Leetcode 5
 Given a string s, return the longest palindromic substring in s.
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
 */
package Strings;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<=1){
            return s;
        }
        String maxStr=s.substring(0,1);
        for(int i=0;i<n-1;i++){
            String odd=palin(s,i,i);
            String even=palin(s,i,i+1);
            if(odd.length()>maxStr.length()){
                maxStr=odd;
            }
            if(even.length()>maxStr.length()){
                maxStr=even;
            }
        }
        return maxStr;
    }
    private String palin(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
}
