package unsolved.p_05_binary_search.nc029_M_02_74_Search_a_2D_Matrix.at_01;

public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        int top = 0;
        int bottom = matrix.length - 1;

        while (top <= bottom) {
            int row = (bottom + top) / 2;
            if (matrix[row][0] == target) {
                return true;
            }
            if (target > matrix[row][matrix[0].length - 1]) {
                top = row + 1;
            } else if (target < matrix[row][0]) {
                bottom = row - 1;
            } else {
                break;
            }
        }

        if (!(top <= bottom)) {
            return false;
        }

        int l = 0;
        int r = matrix[0].length - 1;
        int row = (bottom + top) / 2;

        while (l <= r) {
            int mid = (r + l) / 2;
            if (matrix[row][mid] == target) {
                return true;
            }
            if (target > matrix[row][mid]) {
                l = mid + 1;
            } else if (target < matrix[row][mid]) {
                r = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
