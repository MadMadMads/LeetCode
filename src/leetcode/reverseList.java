package leetcode;

/**
 * @author: Luo
 * @description:206. 反转链表
 * @time: 2020/10/28 22:31
 * Modified By:https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class reverseList {
    public ListNode reverseList(ListNode head) {
        ListNode head1 = new ListNode(0);
        head1.next = null;
        while (head != null) {
            ListNode p = head.next;
            head.next = head1.next;
            head1.next = head;
            head = p;
        }
        return head1.next;
    }
}
