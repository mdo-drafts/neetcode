package solved.p_03_silding_window.rex03_M_904_Fruit_Into_Baskets;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int[] fruits = {1, 2, 1};

        int actual = sut.totalFruit(fruits);

        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {

        int[] fruits = {0, 1, 2, 2};

        int actual = sut.totalFruit(fruits);

        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {

        int[] fruits = {0};

        int actual = sut.totalFruit(fruits);

        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void test_4() {

        int[] fruits = {0, 0, 0, 0};

        int actual = sut.totalFruit(fruits);

        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void test_5() {

        int[] fruits = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};

        int actual = sut.totalFruit(fruits);

        int expected = 5;

        assertEquals(expected, actual);
    }
}