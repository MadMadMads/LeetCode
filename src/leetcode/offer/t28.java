package leetcode.offer;

import jdk.nashorn.internal.parser.Lexer;
import sun.nio.cs.FastCharsetProvider;

/**
 * @author: Luo
 * @description:剑指 Offer 28. 对称的二叉树
 * @time: 2020/6/6 21:25
 * Modified By:https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/
 */
public class t28 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return func1(root.left,root.right);
    }
    public boolean func1(TreeNode left,TreeNode right) {
        if (left ==null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val == right.val) {
            return func1(left.left,right.right) && func1(left.right,right.left);
        } else return false;
    }
}
