package leetcode.offer;

/**
 * @author: Luo
 * @description:剑指 Offer 26. 树的子结构
 * @time: 2020/6/6 14:54
 * Modified By:https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/
 */
public class t26 {
    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B ==null) return false;
        if (A.val == B.val && panduan(A.left,B.left) && panduan(A.right,B.right)) return true;
        return isSubStructure(A.left,B.left) || isSubStructure(A.right,B.right);
    }
    public boolean panduan(TreeNode A,TreeNode B) {
        if (B ==null) return true;
        if (A == null) return false;
        if (A.val == B.val) return panduan(A.left,B.left) && panduan(A.right,B.right);
        else return false;
    }

    public static void main(String[] args) {

    }
}
