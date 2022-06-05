package solved.p_06_linked_list.nc042_M_08_287_Find_the_Duplicate_Number;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] nums = {1, 3, 4, 2, 2};
        int actual = sut.findDuplicate(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        //TODO: Be Careful to all CASES
        int[] nums = {2, 2, 2, 2, 2};
        int actual = sut.findDuplicate(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }
}