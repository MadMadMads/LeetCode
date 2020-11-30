package leetcode.offer;

/**
 * @author: Luo
 * @description:
 * @time: 2020/11/22 21:31
 * Modified By:
 */
public class t24 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode reverseList(ListNode head) {
        ListNode res = new ListNode(0);
        res.next = null;
        while (head != null) {
            ListNode p = head.next;
            head.next = res.next;
            res.next = head;
            head = p;
        }
        return res.next;
    }
}
