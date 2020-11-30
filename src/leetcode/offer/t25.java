package leetcode.offer;

import com.sun.corba.se.impl.oa.poa.AOMEntry;
import leetcode.ListNode;

/**
 * @author: Luo
 * @description:
 * @time: 2020/11/25 12:22
 * Modified By:
 */
public class t25 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        head.next = null;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                p = p.next;
                l1 = l1.next;
            } else {
                p.next = l2;
                p = p.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return head.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        System.out.println(mergeTwoLists(node1,node2));

    }
}
