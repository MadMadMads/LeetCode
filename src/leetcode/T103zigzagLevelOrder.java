package leetcode;

import leetcode.offer.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Luo
 * @description:蛇形遍历
 * @time: 2021/1/3 13:29
 * Modified By:https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/
 */
public class T103zigzagLevelOrder {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return null;
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        boolean flag = true;
        while (!list.isEmpty()) {
            int size = list.size();
            LinkedList<Integer> temp = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = list.pollFirst();
                if (flag) {
                    temp.addLast(node.val);
                } else {
                    temp.addFirst(node.val);
                }
                if (node.left != null) list.add(node.left);
                if (node.right != null) list.add(node.right);
            }
            flag =!flag;
            res.add(temp);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.getTreeNode(new Integer[]{3,9,20,null,null,15,7});
        System.out.println(zigzagLevelOrder(treeNode).toString());
    }
}
