package leetcode;

/**
 * @author: Luo
 * @description:最长公共前缀
 * @time: 2020/4/29 15:49
 * Modified By:https://leetcode-cn.com/problems/longest-common-prefix/
 */
public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
       StringBuilder res = new StringBuilder();
       if (strs.length == 0 || strs == null) return "";
       for (int j = 0; j <strs[0].length(); j++) {
           Character c = strs[0].charAt(j);
           boolean flag = true;
           for (int i = 1; i < strs.length; i++) {
               if (j >= strs.length || c != strs[i].charAt(j)) {
                   flag = false;
                   break;
               }
           }
           if (flag == true) {res.append(c);} else {
               break;
           }
       }
       return res.toString();
    }

    public static void main(String[] args) {
        longestCommonPrefix longestCommonPrefix = new longestCommonPrefix();
        String[] strings = new String[]{"leet","leetcode","lee"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(strings));
    }
}
