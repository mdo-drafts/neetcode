package solved.p_03_silding_window.rex03_M_904_Fruit_Into_Baskets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public int totalFruit(int[] fruits) {

        Map<Integer, Integer> fruitMap = new HashMap<>();

        int max = 0;

        int l = 0;

        for (int r = 0; r < fruits.length; r++) {

            fruitMap.merge(fruits[r], 1, Integer::sum);

            while (fruitMap.size() > 2) {
                int currFruit = fruits[l];
                int count = fruitMap.get(currFruit);
                count--;
                if (count == 0) {
                    fruitMap.remove(currFruit);
                } else {
                    fruitMap.put(currFruit, count);
                }
                l++;
            }

            max = Math.max(r - l + 1, max);
        }
        return max;
    }
}
