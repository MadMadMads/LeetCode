package leetcode.offer.tree;

/**
 * @author: Luo
 * @description:二叉搜索树的最近公共祖先
 * @time: 2020/6/10 22:30
 * Modified By:https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/
 */
public class t68_1 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val < q.val && root.val < p.val) return lowestCommonAncestor(root.right,p,q);
        else if (root.val > q.val && root.val > p.val) return lowestCommonAncestor(root.left,p,q);
        return root;
    }

    public static void main(String[] args) {
        t68_1 t68_1 = new t68_1();
        Integer[] nums = {6,2,8,0,4,7,9,null,null,3,5};
        TreeNode treeNode = TreeNode.getTreeNode(nums);
        TreeNode p =new TreeNode(2);
        TreeNode q =new TreeNode(8);
        t68_1.lowestCommonAncestor(treeNode,p,q);
    }
}
