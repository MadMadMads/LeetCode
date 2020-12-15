package leetcode;

/**
 * @author: Luo
 * @description:19. 删除链表的倒数第N个节点
 * @time: 2020/12/15 22:50
 * Modified By:https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n == 0) return null;
        ListNode p = head,q = head;
        for (int i = 0; i < n ; i++) {
            p = p.next;
        }
        if (p == null) return head.next;
        while (p.next != null) {
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return head;
    }
}
