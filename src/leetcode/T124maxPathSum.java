package leetcode;

import leetcode.offer.tree.TreeNode;

/**
 * @author: Luo
 * @description:124. 二叉树中的最大路径和
 * @time: 2021/1/4 19:56
 * Modified By:https://leetcode-cn.com/problems/binary-tree-maximum-path-sum/
 */
public class T124maxPathSum {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
    }
    public int dfs(TreeNode root) {
        if (root == null) return 0;
        int lmax = Math.max(0,dfs(root.left));
        int rmax = Math.max(0,dfs(root.right));
        res = Math.max(res,root.val + lmax + rmax);
        return root.val + Math.max(lmax,rmax);
    }
}
