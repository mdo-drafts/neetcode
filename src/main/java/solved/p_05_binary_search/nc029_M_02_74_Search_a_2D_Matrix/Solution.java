package solved.p_05_binary_search.nc029_M_02_74_Search_a_2D_Matrix;

public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        int top = 0;
        int bottom = matrix.length - 1;
        while (top <= bottom) {
            int row = (top + bottom) / 2;
            if (target > matrix[row][matrix[0].length - 1]) {
                top++;
            } else if (target < matrix[row][0]) {
                bottom--;
            } else {
                break;
            }
        }
        if (!(top <= bottom)) {
            return false;
        }

        int l = 0;
        int r = matrix[0].length - 1;

        int row = (top + bottom) / 2;
        while (l <= r) {
            int m = (l + r) / 2;
            if (target > matrix[row][m]) {
                l = m + 1;
            } else if (target < matrix[row][m]) {
                r = m - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
