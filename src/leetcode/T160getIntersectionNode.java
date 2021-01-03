package leetcode;

/**
 * @author: Luo
 * @description:160. 相交链表
 * @time: 2021/1/3 14:39
 * Modified By:https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 */
public class T160getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA,q = headB;
        while (p != q) {
           p = p == null ? headB : p.next;
           q = q == null ? headA : q.next;
        }
        return p;
    }
}
