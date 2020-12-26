package leetcode;

import leetcode.offer.tree.TreeNode;

/**
 * @author: Luo
 * @description:654. 最大二叉树
 * @time: 2020/12/26 14:22
 * Modified By:https://leetcode-cn.com/problems/maximum-binary-tree/
 */
public class T654constructMaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums,0,nums.length - 1);
    }
    public TreeNode build(int[] nums,int start,int end) {
        if (start > end) return null;
        int index = -1,max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i; }
        }
        TreeNode root = new TreeNode(nums[index]);
        root.left = build(nums,start,index - 1);
        root.right = build(nums,index +1, end);
        return root;
    }

    public static void main(String[] args) {
        T654constructMaximumBinaryTree t654constructMaximumBinaryTree = new T654constructMaximumBinaryTree();
        t654constructMaximumBinaryTree.constructMaximumBinaryTree(new int[]{3,2,1,6,0,5});
    }
}
