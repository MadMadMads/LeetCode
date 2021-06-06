package leetcode;

import leetcode.offer.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeMap;

/**
 * @description:94. 二叉树的中序遍历
 * @author: Luozhi
 * @create: 2021-02-21 11:53
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 **/
public class T94inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        while (stack.size() > 0 || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode node = stack.pop();
                res.add(node.val);
                root = node.right;
            }
        }
        return res;
    }

}
