package solved.p_06_linked_list.nc037_M_03_143_Reorder_List;

import common.lc_206_listnode.ListNode;

import java.util.Stack;

public class Solution {
    public void reorderList(ListNode head) {

        Stack<ListNode> stack = new Stack<>();

        ListNode stackPointer = head;

        while (stackPointer != null) {
            stack.push(stackPointer);
            stackPointer = stackPointer.next;
        }

        int numToAdd = stack.size() / 2;

        ListNode tmp;
        ListNode changePointer = head;
        while (numToAdd > 0) {
            tmp = changePointer.next;
            changePointer.next = stack.pop();
            changePointer = changePointer.next;
            changePointer.next = tmp;
            changePointer = changePointer.next;
            numToAdd--;
        }
        changePointer.next = null;
    }
}
