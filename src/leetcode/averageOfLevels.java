package leetcode;

import leetcode.offer.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/**
 * @author: Luo
 * @description:637. 二叉树的层平均值
 * @time: 2020/12/10 16:50
 * Modified By:https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/
 */
public class averageOfLevels {
    public static List<Double> averageOfLevels(TreeNode root) {
        if (root == null) return new LinkedList<>();
        List<Double> res = new ArrayList<>();
        LinkedList<TreeNode> list1 = new LinkedList();
        list1.add(root);
        while (!list1.isEmpty()) {
            Double sum = 0.0;
            int n = list1.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = list1.pop();
                sum += node.val;
                if (node.left != null) list1.add(node.left);
                if (node.right != null) list1.add(node.right);
            }
            res.add(sum / n);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode node = TreeNode.getTreeNode(new Integer[]{3,9,20,null,null,15,7});
        System.out.println(averageOfLevels(node));
    }
}
