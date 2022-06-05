package solved.p_06_linked_list.nc040_M_06_2_Add_Two_Numbers;

import common.lc_206_listnode.ListNode;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        int flag = 0;
        while (l1 != null && l2 != null) {

            int sum = l1.val + l2.val + flag;
            if (flag == 1) flag = 0;
            if (sum / 10 > 0) {
                sum = sum - 10;
                flag = 1;
            }
            prev.next = new ListNode(sum);
            prev = prev.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        ListNode tailPointer = l1 == null ? l2 : l1;

        while (tailPointer != null) {
            int sum = tailPointer.val + flag;
            if (flag == 1) flag = 0;
            if (sum / 10 > 0) {
                sum = sum - 10;
                flag = 1;
            }
            prev.next = new ListNode(sum);
            prev = prev.next;
            tailPointer = tailPointer.next;
        }

        if (flag == 1) prev.next = new ListNode(1);

        return dummy.next;
    }
}
