/*
 Leetcode 242
 Given two strings s and t, return true if t is an anagramn of s, and false otherwise.

Input: s = "anagram", t = "nagaram"
Output: true
 */
package Strings;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] store=new int[26];
        for(int i=0;i<s.length();i++){
            store[s.charAt(i)-'a']++;
            store[t.charAt(i)-'a']--;
        }
        for(int n:store){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}
