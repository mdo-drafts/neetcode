package solved_but_optimal.p_01_arrays_hash.nc009_M_09_128_Longest_Consecutive_Sequence.myi_01;

import java.util.HashSet;
import java.util.Set;

//myi -my improvements
//	27 ms	60.6 MB
public class Solution {

    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        Set<Integer> consStarters = new HashSet<>();

        for (int num : nums) numSet.add(num);

        for (int num : numSet) if (!numSet.contains(num - 1)) consStarters.add(num);

        int totalMax = 0;
        int currMax = 0;
        for (int consStater : consStarters) {
            int curr = consStater;
            while (numSet.contains(curr)) {
                currMax++;
                curr++;
            }
            totalMax = Math.max(totalMax, currMax);
            currMax = 0;
        }
        return totalMax;
    }
}
