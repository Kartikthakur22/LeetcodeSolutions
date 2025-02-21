/*
Leetcode-73
 Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
 Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
 */
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        boolean r=false;   //for first row 
        boolean c=false;   //for first column
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(i==0) r=true;   //if first row contains zero 
                    if(j==0) c=true;   //if first col contains zero
                    matrix[i][0]=0;    
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(r){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j]=0;
            }
        }
        if(c){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }
    }
}
