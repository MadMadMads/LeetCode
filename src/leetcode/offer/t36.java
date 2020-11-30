package leetcode.offer;

/**
 * @author: Luo
 * @description:剑指 Offer 36. 二叉搜索树与双向链表
 * @time: 2020/11/13 21:33
 * Modified By:https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/
 */
public class t36 {
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };
    Node head = null,cur = null;
    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        head = dfs(root);
        cur.right = head;
        head.left = cur;
        return head;
    }
    public Node dfs(Node root) {
        if (root == null) return null;
        dfs(root.left);
        if (head == null) {
            head = root;
            cur = head;
        } else {
            cur.right = root;
            root.left = cur;
            cur = root;
        }
        dfs(root.right);
        return head;
    }
    public static void main(String[] args) {

    }
}
