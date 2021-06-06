package leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author: Luo
 * @description:146. LRU 缓存机制
 * @time: 2020/12/21 21:18
 * Modified By:https://leetcode-cn.com/problems/lru-cache/
 */
public class T146LRUCache {
    /*class node {
        int key;
        int val;
        node prev;
        node next;
        public node() {}
        public node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    HashMap<Integer, node> hashMap = new HashMap<>();
    private int size;
    private int capacity;
    private node head,tail;
    public T146LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        // 使用伪头部和伪尾部节点
        head = new node();
        tail = new node();
        head.next = tail;
        tail.prev = head;
    }

    public void addLast(node x) {
        x.prev = tail.prev;
        tail.prev.next = x;
        x.next = tail;
        tail.prev = x;
        size++;
    }

    public node removeFirst() {
        if (head.next == tail) return null;
        node first = head.next;
        removeNode(first);
        size--;
        return first;
    }

    public void deleteKey(int key) {
        node node = hashMap.get(key);
        hashMap.remove(key);
        removeNode(node);
    }

    public void removeNode(node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
    }

    public void makeRecently(int key) {
        node node = hashMap.get(key);
        removeNode(node);
        addLast(node);
    }

    public void addRecnetly(int key, int val) {
        node node = new node(key,val);
        addLast(node);
        hashMap.put(key,node);
    }

    private void removeLeastRecently() {
        node node = removeFirst();
        hashMap.remove(node.key);
    }

    public int get(int key) {
        if (!hashMap.containsKey(key)) return -1;
        makeRecently(key);
        return hashMap.get(key).val;
    }

    public void put(int key, int value) {
        if (!hashMap.containsKey(key)) {
            if (capacity == size) {
                removeLeastRecently();
            }
            addRecnetly(key,value);
        } else {
            deleteKey(key);
            addRecnetly(key,value);
        }
    }*/
    LinkedHashMap linkedHashMap;
    int size;

    public T146LRUCache(int capacity) {
        linkedHashMap = new LinkedHashMap<>(capacity);
        size = capacity;
    }

    public int get(int key) {
        if (!linkedHashMap.containsKey(key)) return -1;
        int value = (int) linkedHashMap.get(key);
        linkedHashMap.remove(key);
        linkedHashMap.put(key,value);
        return value;
    }

    public void put(int key, int value) {
        if (linkedHashMap.containsKey(key)) {
            linkedHashMap.remove(key);
            linkedHashMap.put(key,value);
        }else if (linkedHashMap.size() > size) {
            int key1 = (int) linkedHashMap.keySet().iterator().next();
            linkedHashMap.remove(key1);
        }
        linkedHashMap.put(key,value);
    }
    public static void main(String[] args) {
        T146LRUCache t146LRUCache = new T146LRUCache(2);
        t146LRUCache.put(1,1);
        t146LRUCache.put(2,2);
        t146LRUCache.put(3,3);
        t146LRUCache.put(4,4);
        System.out.println(t146LRUCache.get(3));
    }
}
