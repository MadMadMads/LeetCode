package leetcode;

import java.util.List;

/**
 * @author: Luo
 * @description:206. 反转链表
 * @time: 2021年02月17日23:37:45
 * Modified By:https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class reverseList {
    public static ListNode reverseList(ListNode head) {
        if (head.next == null) return head;
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
    
    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        l1.next = l2;
        l2.next = l3;
        l3.next = null;
        reverseList(l1);
        System.out.println();
    }
}
