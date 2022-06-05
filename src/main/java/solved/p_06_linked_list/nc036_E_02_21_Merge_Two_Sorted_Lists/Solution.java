package solved.p_06_linked_list.nc036_E_02_21_Merge_Two_Sorted_Lists;

import common.lc_206_listnode.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode(-1);

        ListNode prev = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }

        prev.next = list1 == null ? list2 : list1;

        return head.next;
    }
}
