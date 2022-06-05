package solved.p_06_linked_list.nc035_E_01_206_Reverse_Linked_List;

import common.lc_206_listnode.ListNode;

public class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode tmp = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = tmp;
            tmp = curr;
            curr = next;
        }
        return tmp;
    }
}
