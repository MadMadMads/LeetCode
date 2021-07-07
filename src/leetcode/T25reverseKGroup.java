package leetcode;

import java.awt.*;
import java.util.List;

/**
 * @author: Luo
 * @description:25. K 个一组翻转链表
 * @time: 2021年06月29日09:42:39
 * Modified By:https://leetcode-cn.com/problems/reverse-nodes-in-k-group/
 */
public class T25reverseKGroup {
    /*public ListNode reverse(ListNode head,ListNode b) {
        ListNode pre = null,cur = head,next = head;
        while (cur != b) {
            next = cur.next;
            cur.next = pre;
            cur = next;
            pre = cur;
        }
        return cur;
    }
    public ListNode reverseKGroupList(ListNode head,int k) {
        if (head == null) return null;
        ListNode a = head,b = head;
        for (int i = 0; i < k; i++) {
            if (b == null) return a;
            b = b.next;
        }
        ListNode newHead = reverse(head,b);
        a.next = reverseKGroupList(b,k);
        return newHead;
    }*/
    public ListNode reverse(ListNode head,ListNode b) {
        ListNode pre = null,cur = head,next = head;
        while (cur != b) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return cur;
    }
    public ListNode reverseKGroupList(ListNode head,int k) {
        if (head == null) return null;
        ListNode a = head,b = head;
        for (int i = 0; i < k; i++) {
            if (b == null) return a;
            b = b.next;
        }
        ListNode newHead = reverse(a, b);
        a.next = reverseKGroupList(b.next,k);
        return newHead;
    }
}
