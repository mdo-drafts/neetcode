package solved_but_neet.p_01_arrrays_hash.nc007_M_07_36_Valid_Sudoku;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public boolean isValidSudoku(char[][] board) {
        Set<Character> hVisited = new HashSet<>();
        Map<Integer, Set<Character>> vVisited = new HashMap<>();
        for (int i = 0; i < board.length; i++) vVisited.put(i, new HashSet<>());

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char curr = board[i][j];
                if (curr == '.') continue;
                if (hVisited.contains(curr)) return false;
                if (vVisited.get(j).contains(curr)) return false;

                hVisited.add(curr);
                vVisited.get(j).add(curr);
            }
            hVisited = new HashSet<>();
        }

        Set<Character> sVisited = new HashSet<>();
        for (int i = 0; i < board.length; i = i + 3) {
            for (int j = 0; j < board[i].length; j = j + 3) {
                for (int sr = i; sr < i + 3; sr++) {
                    for (int sc = j; sc < j + 3; sc++) {
                        char curr = board[sr][sc];
                        if (curr == '.') continue;
                        if (sVisited.contains(curr)) {
                            return false;
                        }
                        sVisited.add(curr);
                    }
                }
                sVisited = new HashSet<>();
            }
        }
        return true;
    }

}
