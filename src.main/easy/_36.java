package easy;

import java.util.HashSet;
import java.util.Set;

public class _36 {
    public boolean isValidSudoku(char[][] board) {
        int [][]row  =new int[9][10];
        int [][]col  =new int[9][10];
        int [][]box  =new int[9][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j]=='.'){
                    continue;
                }
                int curNum = board[i][j]-'0';
                if (row[i][curNum]==1){
                    return false;
                }if (col[j][curNum]==1){
                    return false;
                }
                if (box[j/3 + (i/3) * 3][curNum]==1){
                    return false;
                }
                row[i][curNum]=1;
                col[j][curNum]=1;
                box[j/3 + (i/3) * 3][curNum]=1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        _36 v = new _36();
        char[][] board = new char[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j]=5;
            }
        }
        v.isValidSudoku(board);
    }
}
