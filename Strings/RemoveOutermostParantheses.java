/*
 Leetcode 1021
 Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
Input: s = "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
 */
package Strings;

public class RemoveOutermostParantheses {
    public String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(count!=0){
                    sb.append(s.charAt(i));
                }
                count++;
            }
            else if(s.charAt(i)==')'){
                count--;
                if(count!=0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
