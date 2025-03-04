/*
Leetcode 36
 Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 */

import java.util.HashSet;
import java.util.Set;
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set seen=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char val=board[i][j];
                if(val!='.'){
                    if(!seen.add(val+" at row "+i) || !seen.add(val+" at col "+j) || !seen.add(val+" value at block "+i/3+"-"+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}