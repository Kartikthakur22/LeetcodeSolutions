/*
 Leetcode 48
 You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){   //Swapping the values of right upper half with left lower half
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int l=0;
            int r=matrix.length-1;
            while(l<r){      //Reversing the every row of matrix
                int t=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=t;
                l++;
                r--;
            }
        }
    }
}
