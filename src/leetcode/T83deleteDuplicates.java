package leetcode;

import java.util.List;

/**
 * @author: Luo
 * @description:83. 删除排序链表中的重复元素
 * @time: 2020/12/30 21:10
 * Modified By:https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 */
public class T83deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode slow = head,fast = head.next;
        while (fast != null) {
            if (slow.val != fast.val) {
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        slow.next = null;
        return head;
    }
}
