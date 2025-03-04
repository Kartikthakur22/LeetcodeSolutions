/*
 Leetcode 8
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
Input: s = " -042"
Output: -42

Input: s = "1337c0d3"
Output: 1337
 */
package Strings;

public class StringToInteger {
    public int myAtoi(String s) {
        int n=s.length();
        if(n==0){
            return 0;
        }
        int ind=0;
        while(ind<n && s.charAt(ind)==' '){
            ind++;
        }
        boolean isNeg=false;
        if(ind<n){
            if(s.charAt(ind)=='-'){
                isNeg=true;
                ind++;
            }
            else if(s.charAt(ind)=='+'){
                ind++;
            }
        }
        int result=0;
        int maxLimit=Integer.MAX_VALUE;
        while(ind<n && isDigit(s.charAt(ind))){
            int cur=s.charAt(ind)-'0';
            if(result>(maxLimit/10) || (result==(maxLimit/10) && cur>7)){
                return isNeg?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            result=(result*10)+cur;
            ind++;
        }
        return isNeg?-result:result;
    }
    private boolean isDigit(char c){
        return (c>='0' && c<='9');
    }
}
