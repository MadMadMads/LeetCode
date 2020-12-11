package leetcode;

/**
 * @author: Luo
 * @description:459. 重复的子字符串
 * @time: 2020/12/10 17:02
 * Modified By:https://leetcode-cn.com/problems/repeated-substring-pattern/
 */
public class repeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (dfs(s,s.substring(0,i),i)) {
                return true;
            }
        }
        return false;
    }
    public static boolean dfs(String s,String temp,int i) {
        if (i == s.length()) return true;
        else if (temp.length()+ i >s.length() || !temp.equals(s.substring(i,i + temp.length()))) return false;
        return dfs(s,temp,i + temp.length());
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abcabcabcabc"));
    }
}
