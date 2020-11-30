package leetcode.offer.tree;

/**
 * @author: Luo
 * @description:二叉树的深度
 * @time: 2020/6/9 18:37
 * Modified By:https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
 */
public class t55 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    int max = 0;
    public int maxDepth(TreeNode root) {
        dfs(root,1);
        return max;
    }
    public void dfs(TreeNode root,int i) {
        if (root == null) return ;
        max = i > max ? i : max;
        dfs(root.left, i + 1);
        dfs(root.right, i + 1);
    }
}
