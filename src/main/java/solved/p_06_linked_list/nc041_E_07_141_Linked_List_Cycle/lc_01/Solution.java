package solved.p_06_linked_list.nc041_E_07_141_Linked_List_Cycle.lc_01;

import common.lc_206_listnode.ListNode;

//TODO: Floyd's Cycle Finding Algorithm - just remember
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
