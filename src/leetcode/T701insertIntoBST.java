package leetcode;

import leetcode.offer.tree.TreeNode;

/**
 * @author: Luo
 * @description:701. 二叉搜索树中的插入操作
 * @time: 2020/12/28 17:56
 * Modified By:https://leetcode-cn.com/problems/insert-into-a-binary-search-tree/
 */
public class T701insertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {return new TreeNode(val);}
        if (val < root.val) {
            root.left = insertIntoBST(root.left,val);
        } else if (val > root.val) {
            root.right = insertIntoBST(root.right,val);
        }
        return root;
    }
}
