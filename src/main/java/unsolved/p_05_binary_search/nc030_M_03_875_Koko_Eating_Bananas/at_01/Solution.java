package unsolved.p_05_binary_search.nc030_M_03_875_Koko_Eating_Bananas.at_01;

public class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int l = 1;
        int r = getMaxElement(piles);

        int res = r;
        while (l <= r) {
            int k = (r + l) / 2;

            int hours = 0;
            for (int i = 0; i < piles.length; i++) {
                hours += Math.ceil(piles[i] / (double) k);
            }
            if (hours > h) {
                l = k + 1;
            } else {
                r = k - 1;
                res = Math.min(k, res);
            }
        }
        return res;
    }

    private int getMaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
