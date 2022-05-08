package solved.p_03_silding_window.rex02_E_1176_Diet_Plan_Performance.lc_01;

public class Solution {

    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int total = 0;
        int sum = 0;

        for (int i = 0; i < calories.length; i++) {
            sum += calories[i];
            //TODO: remember how to use without R pointer - (i >= k - 1)
            if (i >= k - 1) {
                if (sum < lower) total--;
                else if (sum > upper) total++;
                sum -= calories[i - k + 1];
            }
        }
        return total;
    }
}
