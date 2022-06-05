package solved.p_06_linked_list.nc038_M_04_19_Remove_Nth_Node_From_End_of_List;

import common.lc_206_listnode.ListNode;

import java.util.Stack;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        Stack<ListNode> stack = new Stack<>();

        ListNode stackPointer = head;

        while (stackPointer != null) {
            stack.push(stackPointer);
            stackPointer = stackPointer.next;
        }

        if(stack.size() == 1) return null;
        if(stack.size() == n) {
            head = head.next;
            return head;
        }

        int count = 0;

        while (count != n) {
            stackPointer = stack.pop();
            count++;
        }
        ListNode prev = stack.pop();
        prev.next = stackPointer.next;

        return head;
    }
}
