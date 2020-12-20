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
            if (l1.next == null) {
                l1 = headB;
            } else {
                l1 = l1.next;
            }
            if (l2.next == null) {
                l2 = headA;
            } else {
                l2 = l2.next;
            }
        }
        return l1;
    }

    public static void main(String[] args) {

    }
}
