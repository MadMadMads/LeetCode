package leetcode;

import leetcode.offer.tree.TreeNode;

import java.awt.font.TextMeasurer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Luo
 * @description:蛇形遍历
 * @time: 2021年02月21日
 * Modified By:https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/
 */
public class T103zigzagLevelOrder {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return new ArrayList<>();
        LinkedList<TreeNode> temp = new LinkedList<>();
        temp.add(root);
        while (!temp.isEmpty()) {
            LinkedList<Integer> integerList = new LinkedList<>();
            int size = temp.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = temp.pollFirst();
                if (res.size() % 2 == 0) {
                    integerList.addLast(node.val);
                } else {
                    integerList.addFirst(node.val);
                }
                if (node.left != null) temp.add(node.left);
                if (node.right != null) temp.add(node.right);
            }
            res.add(integerList);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.getTreeNode(new Integer[]{3,9,20,null,null,15,7});
        System.out.println(zigzagLevelOrder(treeNode).toString());
    }
}
