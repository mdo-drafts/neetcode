package solved.p_03_silding_window.rex01_E_643_Maximum_Average_Subarray_I;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double actual = sut.findMaxAverage(nums, k);
        double expected = 12.75000;

        assertEquals(expected, actual, 0.00001);

    }


    @Test
    public void test_2() {
        int[] nums = {5};
        int k = 1;

        double actual = sut.findMaxAverage(nums, k);
        double expected = 5.00000;

        assertEquals(expected, actual, 0.00001);

    }
}