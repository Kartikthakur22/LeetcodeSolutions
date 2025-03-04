/*
 Leetcode 1614
 Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.

Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3
Explanation:
Digit 8 is inside of 3 nested parentheses in the string.
 */
package Strings;

public class MaximumNestingDepthOfParanthese {
    public int maxDepth(String s) {
        int count=0,maxi=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                maxi=Math.max(maxi,count);
            }
            else if(s.charAt(i)==')'){
                count--;
            }
        }
        return maxi;
    }
}
