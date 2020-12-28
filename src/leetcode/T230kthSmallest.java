package leetcode;

import leetcode.offer.tree.TreeNode;

/**
 * @author: Luo
 * @description:230. 二叉搜索树中第K小的元素
 * @time: 2020/12/28 16:52
 * Modified By:https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/submissions/
 */
public class T230kthSmallest {
    int count = 0;
    int res = 0;
    public int kthSmallest(TreeNode root, int k) {
        fun1(root,k);
        return res;
    }
    public void fun1(TreeNode root,int k) {
        if (root == null) return ;
        kthSmallest(root.left,k);
        count ++;
        if (count == k) {res =  root.val; return;}
        kthSmallest(root.right,k);
    }
}
