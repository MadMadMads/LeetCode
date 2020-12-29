package leetcode;

import leetcode.offer.tree.TreeNode;

/**
 * @author: Luo
 * @description:98. 验证二叉搜索树
 * @time: 2020/12/28 19:53
 * Modified By:https://leetcode-cn.com/problems/validate-binary-search-tree/
 */
public class T98isValidBST {
    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (!isValidBST(root.left)) {
            return false; }
        if (root.val <= pre) return false;
        pre = root.val;
        return isValidBST(root.right);
    }
}
