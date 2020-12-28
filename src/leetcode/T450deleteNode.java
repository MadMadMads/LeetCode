package leetcode;

import leetcode.offer.tree.TreeNode;

import java.util.TreeMap;

/**
 * @author: Luo
 * @description:450. 删除二叉搜索树中的节点
 * @time: 2020/12/28 17:03
 * Modified By:https://leetcode-cn.com/problems/delete-node-in-a-bst/
 */
public class T450deleteNode {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val < key) {
           root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
           root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null && root.right == null) {
                root = null;
                return root;
            } else if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            else {
                TreeNode min = getMin(root.right);
                root.val = min.val;
                root.right = deleteNode(root.right,root.val);
            }
        }
        return root;
    }
    public TreeNode getMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
