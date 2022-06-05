package solved.p_03_silding_window.nc020_H_06_239_Sliding_Window_Maximum;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] actual = sut.maxSlidingWindow(nums, k);

        int[] expected = {3, 3, 5, 5, 6, 7};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void test_2() {

        int[] nums = {1};
        int k = 1;

        int[] actual = sut.maxSlidingWindow(nums, k);

        int[] expected = {1};

        assertArrayEquals(expected, actual);
    }
}