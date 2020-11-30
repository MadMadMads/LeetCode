package leetcode.offer.tree;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author: Luo
 * @description: 剑指 Offer 32 - I. 从上到下打印二叉树
 * @time: 2020/6/7 12:04
 * Modified By:https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
 */
public class t32_1 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int[] levelOrder(TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return new int[0];
        list.add(root);
        while (!list.isEmpty()) {
            TreeNode node = list.getFirst();
            if (node.left != null) list.add(node.left);
            if (node.right != null) list.add(node.right);
            res.add(node.val);
            list.removeFirst();

        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) ans[i] = res.get(i);
        return ans;
    }
}
