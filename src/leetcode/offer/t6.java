package leetcode.offer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Luo
 * @description:剑指 Offer 06. 从尾到头打印链表
 * @time: 2020/7/1 15:41
 * Modified By:https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
public class t6 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public int[] reversePrint(ListNode head) {
        int length = 0;
        if (head == null) {
            return new int[]{};
        }
        ListNode head1 = new ListNode(0);
        ListNode  p = head,q = head;
        while (q != null) {
            length++;
            q = q.next;
            p.next = head1.next;
            head1.next = p;
            p = q;
        }
        int[] res = new int[length];
        head1 = head1.next;
        for (int i = 0; i < length; i++) {
            res[i] = head1.val;
            head1 = head1.next;
        }
        return res;
    }

}
