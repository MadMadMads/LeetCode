package leetcode;

import leetcode.offer.tree.TreeNode;

/**
 * @author: Luo
 * @description:105. 从前序与中序遍历序列构造二叉树
 * @time: 2020/12/26 14:39
 * Modified By:https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */
public class T105buildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length - 1,inorder,0,inorder.length -1);
    }
    public TreeNode build(int[] preorder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd) {
        if (preStart > preEnd || inStart > inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = -1;
        for (int i = inStart;i <= inEnd; i++) {
            if (preorder[preStart] == inorder[i]) {
                index = i;
                break;
            }
        }
        int leftNum = index - inStart + 1;
        root.left = build(preorder,preStart+1,preStart + leftNum - 1,inorder,inStart,index - 1);
        root.right = build(preorder,preStart + leftNum,preEnd,inorder,index + 1,inEnd);
        return root;
    }
}
