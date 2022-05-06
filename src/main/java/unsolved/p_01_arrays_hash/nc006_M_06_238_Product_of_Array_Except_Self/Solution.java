package unsolved.p_01_arrays_hash.nc006_M_06_238_Product_of_Array_Except_Self;

import java.util.Arrays;

public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        //TODO: Arrays.fill function
        Arrays.fill(res, 1);

        int prefix = 1;
        for (int i = 0; i < res.length; i++) {
            res[i] = prefix;
            prefix = prefix * nums[i];
        }
        int postfix = 1;
        for (int i = res.length - 1; 0 <= i; i--) {

            res[i] = res[i] * postfix;
            postfix = postfix * nums[i];
        }
        return res;
    }
}
