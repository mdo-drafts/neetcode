package solved.p_06_linked_list.nc043_M_09_146_LRU_Cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    class LRUCacheNode {
        int key;
        int value;

        LRUCacheNode prev;
        LRUCacheNode next;

        public LRUCacheNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer, LRUCacheNode> cache = new HashMap<>();
    private int capacity;

    private LRUCacheNode right;

    private LRUCacheNode left;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        left = new LRUCacheNode(0, 0);
        right = new LRUCacheNode(0, 0);
        left.prev = right;
        right.next = left;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            LRUCacheNode node = cache.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            LRUCacheNode node = cache.get(key);
            remove(node);
        }
        LRUCacheNode newNode = new LRUCacheNode(key, value);
        insert(newNode);
        cache.put(key, newNode);

        if (capacity < cache.size()) {
            LRUCacheNode lru = right.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }


    private void insert(LRUCacheNode node) {
        LRUCacheNode prev = this.left.prev;
        LRUCacheNode next = this.left;

        node.prev = prev;
        node.next = next;

        next.prev = node;
        prev.next = node;

    }
    private void remove(LRUCacheNode node) {
        LRUCacheNode prev = node.prev;
        LRUCacheNode next = node.next;
        next.prev = prev;
        prev.next = next;
    }
}
