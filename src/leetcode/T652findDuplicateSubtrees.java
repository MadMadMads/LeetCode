package leetcode;

import leetcode.offer.tree.TreeNode;
import sun.security.krb5.internal.TGSRep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author: Luoz
 * @description:652. 寻找重复的子树
 * @time: 2020/12/26 14:55
 * Modified By:https://leetcode-cn.com/problems/find-duplicate-subtrees/
 */
public class T652findDuplicateSubtrees {
    HashMap<String, Integer> hashMap = new HashMap<>();
    List<TreeNode> res = new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        fun1(root);
        return res;
    }
    public String fun1(TreeNode root) {
        if (root == null) return "#";
        String left = fun1(root.left);
        String right = fun1(root.right);
        String way = left + "," + right + "," + root.val;
        if (hashMap.containsKey(way)) {
            if (hashMap.get(way) == 1) {
                res.add(root);
                hashMap.put(way,hashMap.get(way) + 1);
            }
        } else {
            hashMap.put(way,1);
        }
        return way;
    }
}
