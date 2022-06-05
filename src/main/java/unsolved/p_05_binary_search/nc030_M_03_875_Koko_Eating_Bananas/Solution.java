package unsolved.p_05_binary_search.nc030_M_03_875_Koko_Eating_Bananas;

public class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int l = 1;
        int r = getMaxElement(piles);
        if (piles.length == h) return r;

        int res = r;
        while (r >= l) {
            int k = (r + l) / 2;
            int hours = 0;
            for (int pile : piles) {
                hours += Math.ceil(pile / (double) k);
            }
            if (hours <= h) {
                res = Math.min(res, k);
                r = k - 1;
            } else {
                l = k + 1;
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
