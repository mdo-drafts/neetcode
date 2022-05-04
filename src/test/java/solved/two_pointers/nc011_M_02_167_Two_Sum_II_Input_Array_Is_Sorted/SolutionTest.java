package solved.two_pointers.nc011_M_02_167_Two_Sum_II_Input_Array_Is_Sorted;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] numbers = {-7, -3, -2, 0, 10};
        int target = -10;

        int[] actual = sut.twoSum(numbers, target);

        int[] expected = {1, 2};

        assertArrayEquals(expected, actual);

    }

}