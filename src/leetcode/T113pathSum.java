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
 * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 * 返回:
 *
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 *
 */
public class T113pathSum {
    List<List<Integer>> res;
   /* public List<List<Integer>> pathSum(TreeNode root, int sum) {
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
    }*/
   public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       if (root == null) return new LinkedList<>();
       res = new LinkedList<>();
       pathSum1(root,new LinkedList<>(),targetSum);
       return res;
   }
    public void pathSum1(TreeNode root,LinkedList<Integer> list, int targetSum) {
       if (root == null) return ;
       targetSum -= root.val;
       list.addLast(root.val);
       if (targetSum == 0 && root.right == null && root.left == null) {
           res.add(new LinkedList<>(list));
       }
       pathSum1(root.left,list,targetSum);
       pathSum1(root.right,list,targetSum);
       list.removeLast();
    }

}
