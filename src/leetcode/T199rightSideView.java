package leetcode;

import leetcode.offer.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Luo
 * @description:199. 二叉树的右视图
 * @time: 2021/1/3 15:47
 * Modified By:https://leetcode-cn.com/problems/binary-tree-right-side-view/
 */
public class T199rightSideView {
    List<Integer> res;
    public List<Integer> rightSideView(TreeNode root) {
        res = new ArrayList<>();
        dfs(root,0);
        return res;
    }
    public void dfs(TreeNode root,int depth) {
        if (root == null) return;
        if (depth == res.size()) {
            res.add(root.val);
        }
        depth++;
        dfs(root.right,depth);
        dfs(root.left,depth);
    }
}
