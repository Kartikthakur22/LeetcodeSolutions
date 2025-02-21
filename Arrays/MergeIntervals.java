/*
 Leetcode 56
 Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals
 and return an array of the non-overlapping intervals that cover all the intervals in the input.

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
 */

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> list=new ArrayList<>();
        for(int[] interval:intervals){
            if(list.size()==0){
                list.add(interval);
            }
            else{
                int[] preint=list.get(list.size()-1);
                if(interval[0]<=preint[1]){
                    preint[1]=Math.max(interval[1],preint[1]);
                }
                else{
                    list.add(interval);
                }
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
