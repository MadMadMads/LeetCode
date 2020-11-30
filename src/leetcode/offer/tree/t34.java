package leetcode.offer.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Luo
 * @description:二叉树中和为某一值的路径
 * @time: 2020/6/9 9:34
 * Modified By:https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/
 */
public class t34 {
    LinkedList<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return new ArrayList<>(0);
        LinkedList list = new LinkedList();
        backtrack(list,root,0,sum);
        return res;
    }
    public void backtrack(LinkedList<Integer> list,TreeNode root,int data,int sum) {
        if (root != null) {
            list.add(root.val);
            data = data + root.val;
            if (root.left != null) {
                backtrack(list,root.left,data,sum);
            }
            if (root.right != null) {
                backtrack(list,root.right,data,sum);
            }
            if (root.left == null && root.right ==null && data == sum) {
                res.add(new LinkedList<>(list));
            }
            data = data - root.val;
            list.removeLast();
        }
    }

    public static void main(String[] args) {
        t34 t34 = new t34();
        TreeNode root =  TreeNode.getTreeNode(new Integer[]{7,0,null,-1,-6,null,1,null,null,-7});
        t34.pathSum(root,0);
    }
}
