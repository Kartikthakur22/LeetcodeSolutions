/*
 Leetcode 151
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space
Input: s = "the sky is blue"
Output: "blue is sky the"
 */
package Strings;
public class ReverseWordsInString {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        int si=s.length()-1;
        while(si>=0){
            while(si>=0 && s.charAt(si)==' '){
                si--;
            }
            if(si<0){
                break;
            }
            int ei=si;
            while(si>=0 && s.charAt(si)!=' '){
                si--;
            }
            if(sb.length()==0){
                sb.append(s.substring(si+1,ei+1));
            }
            else{
                sb.append(" ");
                sb.append(s.substring(si+1,ei+1));
            }
        }
        return sb.toString();
    }
}
