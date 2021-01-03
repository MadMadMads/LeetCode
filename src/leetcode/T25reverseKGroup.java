package leetcode;

import java.util.List;

/**
 * @author: Luo
 * @description:25. K 个一组翻转链表
 * @time: 2020/12/25 17:50
 * Modified By:https://leetcode-cn.com/problems/reverse-nodes-in-k-group/
 */
public class T25reverseKGroup {
    public ListNode reverse(ListNode a,ListNode b) {
        ListNode pre = null,cur = a;
        while (cur != b) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode a = head,b = head;
        if (head == null || head.next == null) return head;
        for (int i = 0; i < k;i++) {
            if (b == null) return a;
            b = b.next;
        }
        ListNode newHead = reverse(a,b);
        a.next = reverseKGroup(b,k);
        return newHead;
    }
}
