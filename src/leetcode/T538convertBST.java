package leetcode;

import leetcode.offer.tree.TreeNode;

/**
 * @author: Luo
 * @description:538. 把二叉搜索树转换为累加树
 * @time: 2020/12/28 17:00
 * Modified By:https://leetcode-cn.com/problems/convert-bst-to-greater-tree/
 */
public class T538convertBST {
    int count = 0;
    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        return root;
    }
    public void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.right);
        count += root.val;
        root.val = count;
        dfs(root.left);
    }
}
