/*
Leetcode 796
 Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
 Input: s = "abcde", goal = "cdeab"
Output: true
 */
package Strings;

public class RotateString {
    public boolean rotateString(String s, String goal) {
        return s.length()==goal.length() && (s+s).contains(goal);
    }
}
