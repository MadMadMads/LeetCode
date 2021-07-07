package leetcode;

import java.awt.*;
import java.util.List;

/**
 * @author: Luo
 * @description:92. 反转链表 II
 * @time: 2020/12/25 15:04
 * Modified By:https://leetcode-cn.com/problems/reverse-linked-list-ii/
 */
public class T92reverseBetween {
    ListNode successor = null;
    ListNode reverse(ListNode head,int n) {
        if (n == 1) {
            successor = head.next;
            return head;
        }
        ListNode newHead = reverse(head.next,n-1);
        head.next.next = head;
        head.next = successor;
        return newHead;
    }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == 1) {
            return reverse(head,n);
        }
        head.next = reverseBetween(head.next,m - 1, n -1);
        return head;
    }
}
