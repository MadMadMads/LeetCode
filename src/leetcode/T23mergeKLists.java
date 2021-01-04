package leetcode;

/**
 * @author: Luo
 * @description:23. 合并K个升序链表
 * @time: 2021/1/4 22:47
 * Modified By:https://leetcode-cn.com/problems/merge-k-sorted-lists/
 */
public class T23mergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        return merge(lists, 0, lists.length - 1);
    }
    public ListNode merge(ListNode[] lists, int left, int right) {
        if (left == right) return lists[left];
        int mid = (left + right) / 2;
        ListNode l1 = merge(lists,left,mid);
        ListNode l2 = merge(lists,mid + 1,left);
        return mergeTwoLists(l1,l2);
    }
    public ListNode mergeTwoLists(ListNode a,ListNode b) {
        if (a == null) return b;
        if (b == null) return a;
        if (a.val <= b.val) {
            a.next = mergeTwoLists(a.next,b);
            return a;
        } else {
            b.next = mergeTwoLists(a,b.next);
            return b;
        }
    }
}
