package solved.p_05_binary_search.nc031_M_04_33_Search_in_Rotated_Sorted_Array;

public class Solution {

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {

            int mid = (r + l) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[l] < nums[mid]) {
                if (target < nums[l] || target > nums[mid]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                if (target > nums[r] || target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
}
