package solved_but_neet.p_01_arrrays_hash.nc005_M_05_347_Top_K_Frequent_Elements;

import java.util.*;

//23 ms	50.8 MB
public class Solution {


    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1) return nums;
        int max = 0;

        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int num : nums) {
            if (numsMap.containsKey(num)) {
                int count = numsMap.get(num);
                count++;
                max = Math.max(max, count);
                numsMap.put(num, count);
            } else {
                numsMap.put(num, 1);
                max = Math.max(max, 1);
            }
        }

        Map<Integer, List<Integer>> freqMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            int freqKey = entry.getValue();
            if (freqMap.containsKey(freqKey)) {
                freqMap.get(freqKey).add(entry.getKey());
            } else {
                freqMap.put(freqKey, new ArrayList<>(Collections.singleton(entry.getKey())));
            }
        }

        int[] result = new int[k];
        int index = 0;
        int added = 0;
        while (added != k) {
            if (freqMap.containsKey(max)) {
                for (int item : freqMap.get(max)) {
                    result[index] = item;
                    added++;
                    if (added == k) {
                        break;
                    }
                    index++;
                }
            }
            max--;
        }
        return result;
    }
}
