package leetcode;

import leetcode.offer.tree.TreeNode;

/**
 * @author: Luo
 * @description:337. 打家劫舍 III
 * @time: 2020/12/30 23:00
 * Modified By:https://leetcode-cn.com/problems/house-robber-iii/
 */
public class T337rob {
    public int rob(TreeNode root) {
        if (root == null) return 0;
        int[] nums = fun1(root);
        return Math.max(nums[1],nums[0]);
    }
    public int[] fun1(TreeNode root) {
        if (root == null) return new int[2];
        int[] res = new int[2];
        int[] left = fun1(root.left);
        int[] right = fun1(root.right);
        res[0] = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);
        res[1] = left[0] + right[0] + root.val;
        return res;
    }

    public static void main(String[] args) {
        T337rob t337rob = new T337rob();
        TreeNode root = TreeNode.getTreeNode(new Integer[]{2,1,3,null,4});
        System.out.println(t337rob.rob(root));
    }
}
