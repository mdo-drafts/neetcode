package solved.two_pointers.nc012_M_03_15_3Sum.bad_01;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        //TODO: always think and ask about duplicates in the answer
        Set<List<Integer>> existedResultsSet = new HashSet<>();

        Arrays.sort(nums);
        //TODO: always think about all possible permutations
        int currIndex = nums.length - 1;
        int l = 0;
        while (2 <= currIndex) {
            int r = currIndex - 1;
            int target = -nums[currIndex];
            while (l < r) {
                if (nums[l] + nums[r] == target) {
                    List<Integer> currSet = List.of(nums[l], nums[r], nums[currIndex]);
                    if (!existedResultsSet.contains(currSet)) {
                        result.add(currSet);
                        existedResultsSet.add(currSet);
                    }
                    break;
                }
                if (nums[l] + nums[r] > target) {
                    r--;
                } else {
                    l++;
                }
            }
            currIndex--;
        }
        return result;
    }
}
