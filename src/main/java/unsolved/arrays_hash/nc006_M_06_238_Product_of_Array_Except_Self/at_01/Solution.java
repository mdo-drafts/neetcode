package unsolved.arrays_hash.nc006_M_06_238_Product_of_Array_Except_Self.at_01;

public class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];
        int prefix = 1;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = prefix;
            prefix = prefix * nums[i];
        }

        int postfix = 1;
        //TODO: for lop from the end:
        // check about length - 1, check that 0 <= i (NOT i <=0) check that -- (NOT++)
        //     CHECK!                  CHECK!  CHECK!
        for (int i = answer.length - 1; 0 <= i; i--) {
            answer[i] = answer[i] * postfix;
            postfix = postfix * nums[i];
        }

        return answer;
    }
}
