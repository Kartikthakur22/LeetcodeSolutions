/*
 Leetcode 451
 Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
Return the sorted string. If there are multiple answers, return any of them.

Input: s = "tree"
Output: "eert"
 */
package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        List<Character>[] bucket=new List[s.length()+1];
        for(char ch:hm.keySet()){
            int freq=hm.get(ch);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(char c:bucket[i]){
                    for(int a=0;a<i;a++){
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}
