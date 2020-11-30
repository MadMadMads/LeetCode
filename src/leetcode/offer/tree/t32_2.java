package leetcode.offer.tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Luo
 * @description:剑指 Offer 32 - II. 从上到下打印二叉树 II
 * @time: 2020/6/7 12:29
 * Modified By:https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
 */
public class t32_2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>(0);
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> treeNodeList = new LinkedList<>();
        treeNodeList.addLast(root);
        while (!treeNodeList.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for (int i = treeNodeList.size() -1; i >= 0; i--) {
                TreeNode node = treeNodeList.getFirst();
                treeNodeList.removeFirst();
                list.add(node.val);
                if (root.left != null) treeNodeList.addLast(node.left);
                if (root.right != null) treeNodeList.addLast(node.right);
            }
            res.add(list);
        }
        return res;
    }




    // BFS
    //public List<List<Integer>> levelOrder(TreeNode root) {
    //    if (root == null) return new ArrayList<>(0);
    //    LinkedList<TreeNode> queue = new LinkedList();
    //    queue.add(root);
    //    List<List<Integer>> res = new ArrayList<>();
    //    while (!queue.isEmpty()) {
    //        List<Integer> temp = new ArrayList<>();
    //        for (int i = queue.size() -1;i>=0;i--) {
    //            TreeNode node = queue.poll();
    //            temp.add(node.val);
    //            if (node.left != null) queue.add(node.left);
    //            if (node.right != null) queue.add(node.right);
    //        }
    //        res.add(temp);
    //    }
    //    return res;
    //}
}
