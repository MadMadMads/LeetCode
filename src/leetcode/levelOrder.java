package leetcode;

import leetcode.offer.tree.TreeNode;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Luo
 * @description:102. 二叉树的层序遍历
 * @time: 2020/12/10 16:01
 * Modified By:https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 */
public class levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<TreeNode> list1 = new LinkedList();
        list1.add(root);
        while (!list1.isEmpty()) {
            LinkedList<Integer> temp = new LinkedList();
            int n = list1.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = list1.pop();
                temp.add(node.val);
                if (node.left != null) list1.add(node.left);
                if (node.right != null) list1.add(node.right);
            }
            res.add(temp);
        }
        return res;
    }

}
