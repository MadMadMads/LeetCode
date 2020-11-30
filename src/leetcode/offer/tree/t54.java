package leetcode.offer.tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @author: Luo
 * @description:二叉搜索树的第k大节点
 * @time: 2020/6/9 16:56
 * Modified By:https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
 */
public class t54 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int kthLargest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        dfs(root,list);
        return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(k-1);
    }
    public void dfs(TreeNode node,ArrayList<Integer> list) {
        if (node == null) return ;
        list.add(node.val);
        dfs(node.left,list);
        dfs(node.right,list);
    }
}
