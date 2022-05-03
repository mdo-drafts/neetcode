package solved.arrays_hash.nc006_M_06_238_Product_of_Array_Except_Self;

public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        answer[0] = 1;

        for (int i = 1; i < nums.length; i++) answer[i] = nums[i - 1] * answer[i - 1];

        int postfix = nums[nums.length - 1];

        for (int i = nums.length - 2; 0 <= i; i--) {
            answer[i] = answer[i] * postfix;
            postfix = nums[i] * postfix;
        }

        return answer;
    }
}
