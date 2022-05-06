package solved_but_neet.p_03_silding_window.rex01_643_Maximum_Average_Subarray_I;

public class Solution {

    public double findMaxAverage(int[] nums, int k) {

        double maxAverage;
        double tmpSum = 0;
        for (int i = 0; i < k; i++) {
            tmpSum += nums[i];
        }
        maxAverage = tmpSum / k;

        int l = 1;
        int r = l + k - 1;
        while (r < nums.length) {
            tmpSum = tmpSum - nums[l - 1] + nums[r];
            maxAverage = Math.max(maxAverage, tmpSum / k);
            l++;
            r++;
        }
        return maxAverage;
    }
}
