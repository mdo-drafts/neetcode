package solved.p_06_linked_list.nc045_H_11_25_Reverse_Nodes_in_k_Group;

import common.lc_206_listnode.ListNode;

import java.util.Stack;

public class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        ListNode tail = dummy;
        Stack<ListNode> stack = new Stack<>();

        while (head != null) {
            while (head != null && stack.size() < k) {
                stack.push(head);
                head = head.next;
            }
            if (stack.size() < k) {
                curr.next = tail;
                break;
            }
            while (!stack.isEmpty()) {
                curr.next = stack.pop();
                curr = curr.next;
                curr.next = null;
            }
            tail = head;
        }
        return dummy.next;
    }
}
