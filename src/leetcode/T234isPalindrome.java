package leetcode;

import java.util.List;

/**
 * @author: Luo
 * @description:234. 回文链表
 * @time: 2021/1/3 15:17
 * Modified By:https://leetcode-cn.com/problems/palindrome-linked-list/
 */
public class T234isPalindrome {
    /*递归
    ListNode left;
    public boolean isPalindrome(ListNode head) {
        left = head;
        return isPalindrome(left);
    }
    public boolean traverse(ListNode right) {
        if (right == null) return true;
        boolean res = traverse(right.next);
        res = res && left.val == right.val;
        left = left.next;
        return res;
    }*/
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        ListNode slow = head,fast = head,pre = head,prepre = null;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
            pre.next = prepre;
            prepre = pre;
        }
        if (fast != null) slow = slow.next;
        while (pre != null && slow != null) {
            if (pre.val != slow.val) return false;
            pre = pre.next;
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {
        T234isPalindrome t234isPalindrome = new T234isPalindrome();
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode.next = listNode2;
        listNode2.next = null;
        System.out.println(t234isPalindrome.isPalindrome(listNode));
    }
}
