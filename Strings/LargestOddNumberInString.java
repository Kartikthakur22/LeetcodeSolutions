/*
 Leetcode 1903
 You are given a string num, representing a large integer.
 Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
A substring is a contiguous sequence of characters within a string.

Input: num = "52"
Output: "5"
 */
package Strings;

public class LargestOddNumberInString {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            int n=num.charAt(i);
            if(n%2!=0){
                return num.substring(0,i+1);
                }
            }
        return "";
    }
}
