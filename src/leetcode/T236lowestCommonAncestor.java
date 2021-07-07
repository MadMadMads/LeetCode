package leetcode;

import leetcode.offer.tree.TreeNode;

/**
 * @author: Luo
 * @description:236. 二叉树的最近公共祖先
 * @time: 2021/1/3 13:55
 * Modified By:https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
 */
public class T236lowestCommonAncestor {
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q || root == null) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if (left == null && right == null) return null;
        if (left == null || right == null) return left == null ? right : left;
        return root;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null && right == null) return null;
        else if (left == null || right == null) {
            return left == null ? right : left;
        } else {
            return root;
        }
    }
}
