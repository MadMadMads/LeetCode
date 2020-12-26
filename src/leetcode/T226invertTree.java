package leetcode;

import leetcode.offer.tree.TreeNode;

/**
 * @author: Luo
 * @description:226. 翻转二叉树
 * @time: 2020/12/26 13:40
 * Modified By:https://leetcode-cn.com/problems/invert-binary-tree/
 */
public class T226invertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = new TreeNode(0);
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
