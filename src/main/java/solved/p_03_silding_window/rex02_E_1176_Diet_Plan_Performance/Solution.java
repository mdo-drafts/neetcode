package solved.p_03_silding_window.rex02_E_1176_Diet_Plan_Performance;

public class Solution {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int total = 0;

        int currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum += calories[i];
        }

        if (currSum > upper) total++;
        if (currSum < lower) total--;


        for (int l = 1, r = l + k - 1; r < calories.length; l++, r++) {
            //TODO: remember how to use without R pointer - (i >= k - 1)
            currSum = currSum + calories[r] - calories[l - 1];
            if (currSum > upper) total++;
            if (currSum < lower) total--;
        }
        return total;
    }
}
