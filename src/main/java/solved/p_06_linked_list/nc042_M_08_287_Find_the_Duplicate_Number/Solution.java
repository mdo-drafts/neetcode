package solved.p_06_linked_list.nc042_M_08_287_Find_the_Duplicate_Number;

//Floyd's Tortoise and Hare (Cycle Detection)
public class Solution {

    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);


        int slow2 = 0;

        while (slow != slow2) {
            slow = nums[slow];
            slow2 = nums[slow2];
        }
        return slow;
    }
}
