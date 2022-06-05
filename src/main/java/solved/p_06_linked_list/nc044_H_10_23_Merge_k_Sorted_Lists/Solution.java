package solved.p_06_linked_list.nc044_H_10_23_Merge_k_Sorted_Lists;

import common.lc_206_listnode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;


        ListNode min;
        int minIndex = 0;

        int capacity = lists.length;
        Set<Integer> nullIndexSet = new HashSet<>();
        while (0 < capacity) {
            int i = 0;
            min = new ListNode(Integer.MAX_VALUE);
            for (ListNode node : lists) {
                if (!nullIndexSet.contains(i)) {
                    if (node == null) {
                        nullIndexSet.add(i);
                        capacity--;
                    } else {
                        if (node.val < min.val) {
                            min = node;
                            minIndex = i;
                        }
                    }
                }
                i++;
            }
            if (0 < capacity) {
                curr.next = min;
                curr = curr.next;
                lists[minIndex] = lists[minIndex].next;
            }
        }
        return dummy.next;
    }
}
