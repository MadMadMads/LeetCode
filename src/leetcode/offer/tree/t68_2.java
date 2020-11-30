package leetcode.offer.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.WeakHashMap;

/**
 * @author: Luo
 * @description:
 * @time: 2020/6/11 16:26
 * Modified By:
 */
public class t68_2 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null; // 如果树为空，直接返回null
        if(root == p || root == q) return root; // 如果 p和q中有等于 root的，那么它们的最近公共祖先即为root（一个节点也可以是它自己的祖先）
        TreeNode left = lowestCommonAncestor(root.left, p, q); // 递归遍历左子树，只要在左子树中找到了p或q，则先找到谁就返回谁
        TreeNode right = lowestCommonAncestor(root.right, p, q); // 递归遍历右子树，只要在右子树中找到了p或q，则先找到谁就返回谁
        if(left == null) return right; // 如果在左子树中 p和 q都找不到，则 p和 q一定都在右子树中，右子树中先遍历到的那个就是最近公共祖先（一个节点也可以是它自己的祖先）
        else if(right == null) return left; // 否则，如果 left不为空，在左子树中有找到节点（p或q），这时候要再判断一下右子树中的情况，如果在右子树中，p和q都找不到，则 p和q一定都在左子树中，左子树中先遍历到的那个就是最近公共祖先（一个节点也可以是它自己的祖先）
        else return root; //否则，当 left和 right均不为空时，说明 p、q节点分别在 root异侧, 最近公共祖先即为 root
    }

    public static void main(String[] args) throws InterruptedException {
        TreeNode node = TreeNode.getTreeNode(new Integer[]{3,5,1,6,2,0,8,null,null,7,4});
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        t68_2 t68_2 = new t68_2();
        t68_2.lowestCommonAncestor(node,node1,node2);
    }

}
