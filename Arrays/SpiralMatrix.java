/*
 Leetcode 54
 Given an m x n matrix, return all elements of the matrix in spiral order.

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
 */
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0,t=0,r=n-1,d=m-1;
        int dir=0;
     while(l<=r && t<=d){
         if(dir==0){
             for(int i=l;i<=r;i++){
                 ans.add(matrix[t][i]);
                 }
             t++;
             
             }
         if(dir==1){
             for(int i=t;i<=d;i++){
                 ans.add(matrix[i][r]);
                 }
             r--;
             
             }
         if(dir==2){
             for(int i=r;i>=l;i--){
                 ans.add(matrix[d][i]);
                 }
             d--;
             
             }
         if(dir==3){
             for(int i=d;i>=t;i--){
                 ans.add(matrix[i][l]);
                 }
             l++;
             
             }
         
             dir=(dir+1)%4;
          
         }
        return ans;
    }
}
