package leetcode.offer;

import com.sun.corba.se.impl.oa.poa.AOMEntry;
import leetcode.ListNode;

/**
 * @author: Luo
 * @description:21. 合并两个有序链表
 * @time: 2020/11/25 12:22
 * Modified By:https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class t25 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val >= l2.val) {
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        System.out.println(mergeTwoLists(node1,node2));

    }
}
