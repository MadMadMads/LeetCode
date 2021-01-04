package leetcode;

import leetcode.offer.tree.TreeNode;

/**
 * @author: Luo
 * @description:101. 对称二叉树
 * @time: 2021/1/4 20:36
 * Modified By:https://leetcode-cn.com/problems/symmetric-tree/
 */
public class T101isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left,root.right);
    }
    public boolean isSymmetric(TreeNode left,TreeNode right) {
        if (left == null && right == null) return true;
        else if (left == null || right == null) return false;
        return left.val == right.val && isSymmetric(left.right,right.left) && isSymmetric(left.left,right.right);
    }

    public static void main(String[] args) {
        T101isSymmetric t101isSymmetric = new T101isSymmetric();
        TreeNode treeNode = TreeNode.getTreeNode(new Integer[]{1,2,2,3,4,4,3});
        System.out.println(t101isSymmetric.isSymmetric(treeNode));
    }
}
