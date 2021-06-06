package leetcode.offer.tree;

/**
 * @author: Luo
 * @description:二叉树的深度
 * @time: 2020/6/9 18:37
 * Modified By:https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
 */
public class t55 {

    int max = 0;
    public int maxDepth(TreeNode root) {
        getMax(root);
        return max;
    }
    public int getMax(TreeNode root) {
        if (root == null) return 0;
        int left = getMax(root.left);
        int right = getMax(root.right);
        int depth = Math.max(left,right) + 1;
        max = Math.max(max,depth);
        return depth;
    }

    public static void main(String[] args) {
        t55 t55 = new t55();
        TreeNode node = leetcode.offer.tree.TreeNode.getTreeNode(new Integer[]{3,9,20,null,null,15,7});
        System.out.println(t55.maxDepth(node));
    }
}
