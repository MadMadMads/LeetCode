package leetcode.offer;


import java.util.HashMap;

/**
 * @author: Luo
 * @description:
 * @time: 2020/11/5 14:13
 * Modified By:
 */
public class t52 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA,l2 = headB;
        while (l1 != l2) {
            l1 = l1 == null ? headB : l1.next;
            l2 = l2 == null ? headA : l2.next;
        }
        return l1;
    }

    public static void main(String[] args) {

    }
}
