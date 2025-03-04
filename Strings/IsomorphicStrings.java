/*
Leetcode 205
 Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character, but a character may map to itself.

Input: s = "egg", t = "add"
Output: true
 */
package Strings;

import java.util.Arrays;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[] m1=new int[256];
        int[] m2=new int[256];
        Arrays.fill(m1,-1);
        Arrays.fill(m2,-1);
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if((m1[c1]!=-1 && m1[c1]!=c2) || (m2[c2]!=-1 && m2[c2]!=c1)){
                return false;
                }
            m1[c1]=c2;
            m2[c2]=c1;
            }
        return true;
    }
}
