package leetcode;

/**
 * @author: Luo
 * @description:
 * @time: 2020/7/2 22:33
 * Modified By:
 */
public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int flag = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int i = x + y +flag;
            flag = i / 10;
            i = i % 10;
            cur.next = new ListNode(i);
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (flag == 1) {
            cur.next = new ListNode(flag);
        }
        return pre.next;
    }

    public static void main(String[] args) {

    }
}

