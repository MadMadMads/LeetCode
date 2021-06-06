package leetcode.offer.tree;

import java.lang.annotation.ElementType;

/**
 * @author: Luo
 * @description:平衡二叉树
 * @time: 2020/6/9 22:09
 * Modified By:https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/
 */
public class t55_2 {

    /*public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(depth(root.right) - depth(root.left)) <= 1) {
            return isBalanced(root.left) && isBalanced(root.right);
        } else return false;
    }
    public int depth(TreeNode root) {
        if (root == null ) return 0;
        return Math.max(depth(root.left),depth(root.right)) + 1;
    }*/
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(getDepth(root.right) - getDepth(root.left)) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }
    public int getDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(getDepth(root.left),getDepth(root.right)) + 1;
    }
}
