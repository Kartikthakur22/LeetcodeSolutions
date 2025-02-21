/*
 Leetcode-118
 Given an integer numRows, return the first numRows of Pascal's triangle.
 Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> rows=new ArrayList<>(i+1);
            for(int j=0;j<=i;j++){
                if(j==0 || i==j){      //if first or last element of row add 1
                    rows.add(1);
                }
                else{      //else put the sum of upper and upper left element
                    rows.add(result.get(i-1).get(j)+result.get(i-1).get(j-1));
                }
            }
            result.add(rows);
        }
        return result;
    }
}
