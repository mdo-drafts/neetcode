package solved.p_01_arrays_hash.nc007_M_07_36_Valid_Sudoku.nc_01;

import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        //TODO: just ONE HashSet! for for row & col & square checking
        //TODO: used combined String as a HashCode
        HashSet<String> h1 = new HashSet<String>();

        //TODO: just ONE loop! for row & col & square checking
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {

                    //Check whether HashSet contains duplicate elements in row and column
                    if (h1.contains("row" + i + board[i][j]) || h1.contains("col" + j + board[i][j])) {
                        return false;
                    }
                    h1.add("row" + i + board[i][j]);
                    h1.add("col" + j + board[i][j]);


                    //Check whether Box contains duplicate elements in it
                    if (h1.contains("box" + (i / 3) * 3 + j / 3 + board[i][j])) {
                        return false;
                    }
                    h1.add("box" + (i / 3) * 3 + j / 3 + board[i][j]);
                }
            }
        }
        return true;
    }
}
