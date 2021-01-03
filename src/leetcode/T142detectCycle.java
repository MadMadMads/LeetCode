package leetcode;

/**
 * @author: Luo
 * @description:142. 环形链表 II
 * @time: 2021/1/3 12:58
 * Modified By:https://leetcode-cn.com/problems/linked-list-cycle-ii/
 */
public class T142detectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head,fast = head,res = null;
        while (true) {
            if (fast == null || fast.next ==null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
