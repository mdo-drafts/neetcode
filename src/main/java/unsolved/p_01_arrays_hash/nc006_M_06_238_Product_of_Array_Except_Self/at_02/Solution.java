package unsolved.p_01_arrays_hash.nc006_M_06_238_Product_of_Array_Except_Self.at_02;

public class Solution {

    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        int prefix = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        int postfix = 1;

        //TODO: INDEXES!!! '--'
        for (int i = nums.length - 1; 0 <= i; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }

        return result;
    }
}
