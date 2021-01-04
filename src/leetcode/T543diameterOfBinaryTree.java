package leetcode;

import leetcode.offer.tree.TreeNode;

import java.util.TreeMap;

/**
 * @author: Luo
 * @description:543. 二叉树的直径
 * @time: 2021/1/4 20:49
 * Modified By:https://leetcode-cn.com/problems/diameter-of-binary-tree/
 */
public class T543diameterOfBinaryTree {
    int res = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        getDepth(root);
        return res - 1;
    }
    public int getDepth(TreeNode root) {
        if (root == null) return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        res = Math.max(left+right + 1, res);
        return Math.max(left,right) + 1;
    }

    public static void main(String[] args) {
        T543diameterOfBinaryTree t543diameterOfBinaryTree = new T543diameterOfBinaryTree();
        TreeNode treeNode = TreeNode.getTreeNode(new Integer[]{1,2,3,4,5});
        System.out.println();
    }

}
