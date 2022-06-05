package solved.p_06_linked_list.nc041_E_07_141_Linked_List_Cycle;

import common.lc_206_listnode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        while (head != null) {
            if (visited.contains(head)) {
                return true;
            }
            visited.add(head);
            head = head.next;
        }
        return false;
    }
}
