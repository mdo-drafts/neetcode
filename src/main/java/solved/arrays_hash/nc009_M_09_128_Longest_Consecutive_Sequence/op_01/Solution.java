package solved.arrays_hash.nc009_M_09_128_Longest_Consecutive_Sequence.op_01;

import java.util.HashSet;
import java.util.Set;

//46 ms	60.2 MB
public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) numSet.add(num);

        int totalMax = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int curr = num;
                int currMax = 0;
                while (numSet.contains(curr)) {
                    currMax++;
                    curr++;
                }
                totalMax = Math.max(totalMax, currMax);
            }
        }
        return totalMax;
    }
}
