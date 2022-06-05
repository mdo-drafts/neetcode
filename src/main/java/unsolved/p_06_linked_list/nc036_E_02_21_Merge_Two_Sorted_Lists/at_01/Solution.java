package unsolved.p_06_linked_list.nc036_E_02_21_Merge_Two_Sorted_Lists.at_01;

import common.lc_206_listnode.ListNode;

//!WRONG
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode preHead = new ListNode(-1);
        ListNode prev = preHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                //!WRONG
                prev = list1;
                list1 = list1.next;
            } else {
                //!WRONG
                prev = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }

        prev.next = list1 == null ? list2 : list1;

        return preHead.next;
    }
}
