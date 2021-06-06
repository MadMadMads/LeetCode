package leetcode;

import java.util.List;

/**
 * @author: Luo
 * @description:142. 环形链表 II
 * @time: 2021/1/3 12:58
 * Modified By:https://leetcode-cn.com/problems/linked-list-cycle-ii/
 */
public class T142detectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head,fast = head;
        boolean hasCycle = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                hasCycle = true;
                break;
            }
        }
        if (hasCycle) {
            fast = head;
            while (fast != slow) {
                fast = fast.next;
                slow = slow.next;
            }
            return fast;
        }
        return null;
    }
}
