package leetcode.offer;

import java.util.ArrayList;

/**
 * @author: Luo
 * @description:链表中倒数第k个节点
 * @time: 2020/6/20 21:51
 * Modified By:https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 */
public class t22 {
    public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
    public ListNode getKthFromEnd(ListNode head, int k) {
        ArrayList<ListNode> list = new ArrayList<>();
        if (head == null) return null;
        ListNode p = head;
        while (p != null) {
            list.add(p);
            p = p.next;
        }
        return list.get(list.size() - k);
    }
}
