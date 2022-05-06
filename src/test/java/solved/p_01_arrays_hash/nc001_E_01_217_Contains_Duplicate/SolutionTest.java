package solved.p_01_arrays_hash.nc001_E_01_217_Contains_Duplicate;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        int[] input = {1,2,3,1};
        assertTrue(sut.containsDuplicate(input));
    }

}