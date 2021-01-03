package leetcode;

/**
 * @author: Luo
 * @description:21. 合并两个有序链表
 * @time: 2021/1/3 14:43
 * Modified By:https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class T21mergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0),tail = head;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                tail.next = l2;
                l2 = l2.next;
                tail = tail.next;
            } else {
                tail.next = l1;
                l1 = l1.next;
                tail = tail.next;
            }
        }
        tail.next = l1 == null ? l2 : l1;
        return head.next;
    }
}
