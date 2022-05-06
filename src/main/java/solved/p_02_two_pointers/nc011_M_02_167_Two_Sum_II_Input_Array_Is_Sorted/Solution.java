package solved.p_02_two_pointers.nc011_M_02_167_Two_Sum_II_Input_Array_Is_Sorted;

public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        int[] result = new int[2];

        while (l < r) {
            if (numbers[l] + numbers[r] == target) {
                result[0] = l + 1;
                result[1] = r + 1;
                return result;
            }
            if (numbers[l] + numbers[r] > target) {
                r--;
            } else {
                l++;
            }
        }
        return result;
    }
}
