package leetcode;

/**
 * @author: Luo
 * @description:116. 填充每个节点的下一个右侧节点指针
 * @time: 2020/12/26 13:34
 * Modified By:https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/
 */

public class T116connect {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    /*public Node connect(Node root) {
        if (root == null) return root;
        connect1(root.left,root.right);
        return root;
    }*/
    public Node connect(Node root) {
        if (root == null) return null;
        Node pre = root;
        while (pre.left != null) {
            Node temp = pre;
            while (temp != null) {
                temp.left.next = temp.right;
                if (temp.next != null) {
                    temp.right.next = temp.next.left;
                }
                temp = temp.next;
            }
            pre = pre.left;
        }
        return root;
    }
    public void connect1(Node node1,Node node2) {
        if (node1 == null || node2 == null) return;
        node1.next = node2;
        connect1(node1.left,node1.right);
        connect1(node2.left,node2.right);
        connect1(node1.right,node2.left);
    }
}
