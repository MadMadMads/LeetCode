package leetcode;

import leetcode.offer.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Luo
 * @description:113. 路径总和 II
 * @time: 2021/1/4 21:00
 * Modified By:https://leetcode-cn.com/problems/path-sum-ii/
 */
public class T113pathSum {
    List<List<Integer>> res;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        res = new ArrayList<>();
        LinkedList<Integer> path=new LinkedList<>();
        pathSum(root,path,sum);
        return res;
    }
    public void pathSum(TreeNode root,LinkedList<Integer> list,int sum) {
        if (root == null) {
            return;
        }
        list.offerLast(root.val);
        sum -= root.val;
        if (root.right == null && root.left == null && 0 == sum) {
            res.add(new LinkedList<>(list));
        }
        pathSum(root.left,list,sum);
        pathSum(root.right,list,sum);
        list.pollLast();
    }
}
