package solved.p_01_arrays_hash.nc005_M_05_347_Top_K_Frequent_Elements.nc_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//15 ms	51.2 MB
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<List<Integer>> freqList = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            freqList.add(new ArrayList<>());
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.merge(num, 1, Integer::sum);
        }

        //TODO: using frequency as an index - bucket sort
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            freqList.get(entry.getValue()).add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = freqList.size() - 1; 0 <= i; i--) {
            if (index == result.length) break;
            if (!freqList.get(i).isEmpty()) {
                for (int item : freqList.get(i)) {
                    if (index == result.length) break;
                    result[index] = item;
                    index++;
                }
            }
        }
        return result;
    }
}
