package solved.p_06_linked_list.nc038_M_04_19_Remove_Nth_Node_From_End_of_List;

import common.lc_206_listnode.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        sut.removeNthFromEnd(n1, 2);

        ListNode en5 = new ListNode(5);
        ListNode en3 = new ListNode(3, en5);
        ListNode en2 = new ListNode(2, en3);
        ListNode en1 = new ListNode(1, en2);

        while (en1 != null && n1 != null) {
            assertEquals(en1.val, n1.val);
            en1 = en1.next;
            n1 = n1.next;
        }
        assertTrue(en1 == null && n1 == null);
    }

    @Test
    public void test_2() {
        ListNode n2 = new ListNode(2);
        ListNode n1 = new ListNode(1, n2);

        sut.removeNthFromEnd(n1, 1);

        ListNode en1 = new ListNode(1);

        while (en1 != null && n1 != null) {
            assertEquals(en1.val, n1.val);
            en1 = en1.next;
            n1 = n1.next;
        }
        assertTrue(en1 == null && n1 == null);
    }

    @Test
    public void test_3(){
        ListNode n2 = new ListNode(2);
        ListNode n1 = new ListNode(1, n2);

        ListNode res = sut.removeNthFromEnd(n1, 2);

        ListNode en1 = new ListNode(2);

        while (en1 != null && res != null) {
            assertEquals(en1.val, res.val);
            en1 = en1.next;
            res = res.next;
        }
        assertTrue(en1 == null && res == null);
    }

}