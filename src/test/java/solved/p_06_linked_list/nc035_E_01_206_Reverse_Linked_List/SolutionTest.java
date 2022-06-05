package solved.p_06_linked_list.nc035_E_01_206_Reverse_Linked_List;

import common.lc_206_listnode.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        ListNode n6 = new ListNode(6);
        ListNode n5 = new ListNode(5, n6);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        ListNode reversed = sut.reverseList(n1);
        int expected = 6;
        assertEquals(expected, reversed.val);


    }


}