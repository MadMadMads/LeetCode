package leetcode;

import leetcode.offer.tree.TreeNode;

import java.util.Arrays;

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
        if (preEnd < preStart || inStart > inEnd) return null;
        int rootVal = preorder[preStart];
        int index = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                index = i;
                break;
            }
        }
        int leftLength = index - inStart;
        TreeNode treeNode = new TreeNode(rootVal);
        treeNode.left = build(preorder,preStart + 1,preStart + leftLength,inorder,inStart,index - 1);
        treeNode.right = build(preorder,preStart + leftLength + 1,preEnd,inorder,index + 1,inEnd);
        return treeNode;
    }
    /*public TreeNode build(int[] preorder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd) {
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
    }*/
    public void test1(Integer i,Integer ... objects) {
        System.out.println(objects);
    }
    public static void main(String[] args) {
        T105buildTree t105buildTree = new T105buildTree();
        Integer i[]={1,2,3,4,5};
        Integer j[]={1,2,3,4,5};
        t105buildTree.test1(1,i);
    }
}
