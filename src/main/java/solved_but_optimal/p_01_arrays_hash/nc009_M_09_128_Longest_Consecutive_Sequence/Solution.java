package solved_but_optimal.p_01_arrays_hash.nc009_M_09_128_Longest_Consecutive_Sequence;

import java.util.HashSet;
import java.util.Set;

//62 ms	65.4 MB
public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) numSet.add(num);

        int totalMax = 0;
        int currMax = 0;

        Set<Integer> visited = new HashSet<>();

        for (int num : nums) {
            if(!visited.contains(num)){
                int currNum = num;
                while (numSet.contains(currNum)) {
                    visited.add(currNum);
                    currNum++;
                    currMax++;
                }
                currNum = num -1;
                while (numSet.contains(currNum)) {
                    visited.add(currNum);
                    currNum--;
                    currMax++;
                }
                totalMax = Math.max(totalMax, currMax);
                currMax = 0;
            }
        }
        return totalMax;
    }
}
