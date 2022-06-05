package solved.p_06_linked_list.nc039_M_05_138_Copy_List_with_Random_Pointer;

import lc_138_random_pointer.Node;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Node copyRandomList(Node head) {

        Map<Node, Node> oldToCopyMap = new HashMap<>();

        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.val);
            oldToCopyMap.put(curr, copy);
            curr = curr.next;
        }

        curr = head;
        while(curr != null){
            Node copy = oldToCopyMap.get(curr);
            copy.next = oldToCopyMap.get(curr.next);
            copy.random = oldToCopyMap.get(curr.random);
            curr = curr.next;
        }
        return oldToCopyMap.get(head);
    }
}
