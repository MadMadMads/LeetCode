package leetcode;

import leetcode.offer.tree.TreeNode;

/**
 * @author: Luo
 * @description:110. 平衡二叉树
 * @time: 2021/1/4 21:49
 * Modified By:https://leetcode-cn.com/problems/balanced-binary-tree/
 */
public class T110isBalanced {
    public boolean isBalanced(TreeNode root) {
        return isBalanced1(root) != -1;
    }
    public int isBalanced1(TreeNode root) {
        if (root == null) return 0;
        int left = isBalanced1(root.left);
        if (left == -1) return -1;
        int right = isBalanced1(root.right);
        if (right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left,right) + 1 : -1;
    }
}
