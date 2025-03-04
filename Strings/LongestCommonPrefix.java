/*
 Leetcode 14
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Input: strs = ["flower","flow","flight"]
Output: "fl"
 */
package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strs);
        String a=strs[0];
        String b=strs[strs.length-1];
        int n=Math.min(a.length(),b.length());
        for(int i=0;i<n;i++){
            if(a.charAt(i)!=b.charAt(i)){
                return sb.toString();
                }
            sb.append(a.charAt(i));
            }
        return sb.toString();
    }
}
