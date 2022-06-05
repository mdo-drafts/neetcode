package unsolved.p_05_binary_search.nc028_E_01_704_Binary_Search;

public class Solution {

    public int search(int[] nums, int target) {
        return bSearch(nums, 0, nums.length - 1, target);
    }

    private int bSearch(int[] nums, int l, int r, int target) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                return bSearch(nums, l, mid - 1, target);
            }
            return bSearch(nums, mid + 1, r, target);
        }
        return -1;
    }
}
