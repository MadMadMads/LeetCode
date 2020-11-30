package leetcode.offer;

import java.util.List;

/**
 * @author: Luo
 * @description:
 * @time: 2020/11/23 15:45
 * Modified By:
 */
public class t18 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) return head.next;
        ListNode p = head.next,q = head;
        while (p != null) {
            if (p.val == val) {
                q.next = p.next;
                p.next = null;
            }
            p = p.next;
            q = q.next;
        }
        return head;
    }
}
