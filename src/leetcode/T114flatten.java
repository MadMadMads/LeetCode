package leetcode;

import leetcode.offer.tree.TreeNode;

/**
 * @author: Luo
 * @description:114. 二叉树展开为链表
 * @time: 2020/12/26 14:12
 * Modified By:https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
 */
public class T114flatten {
    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.left);
        flatten(root.right);
        TreeNode right = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode p = root;
        while (p.right != null) {
            p = p.right;
        }
        p.right = right;
    }
}
