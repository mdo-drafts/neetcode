package solved.p_03_silding_window.rex02_E_1176_Diet_Plan_Performance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] calories = {1, 2, 3, 4, 5};
        int k = 1, lower = 3, upper = 3;

        int actual = sut.dietPlanPerformance(calories, k, lower, upper);

        int expected = 0;

        assertEquals(expected, actual);
    }


    @Test
    public void test_2() {
        int[] calories = {3, 2};
        int k = 2, lower = 0, upper = 1;

        int actual = sut.dietPlanPerformance(calories, k, lower, upper);

        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {
        int[] calories = {6,5,0,0};
        int k = 2, lower = 1, upper = 5;

        int actual = sut.dietPlanPerformance(calories, k, lower, upper);

        int expected = 0;

        assertEquals(expected, actual);
    }
}