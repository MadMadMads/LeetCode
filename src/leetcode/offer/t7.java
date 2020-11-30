package leetcode.offer;

import java.util.HashMap;

/**
 * @author: Luo
 * @description:剑指 Offer 07. 重建二叉树
 * @time: 2020/6/5 18:47
 * Modified By:https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
 */
public class t7 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    // 将两个中序前序全局化
    int[] preorder;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            hashMap.put(inorder[i],i);
        }
        return recursive(0,0,inorder.length -1);
    }
    public TreeNode recursive(int pre_root, int in_left, int in_right) {
        if (in_left > in_right) {return null;}
        TreeNode root = new TreeNode(preorder[pre_root]);
        //前序的根节点在中序中的位置
        int i = hashMap.get(preorder[pre_root]);
        //区分左子树
        root.left = recursive(pre_root + 1, in_left, i - 1);
        //区分右子树
        root.right = recursive(pre_root + i - in_left + 1, i+1, in_right);
        return root;
    }
}
