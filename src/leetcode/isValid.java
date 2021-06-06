package leetcode;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author: Luo
 * @description:20. 有效的括号
 * @time: 2020/5/20 14:03
 * Modified By:https://leetcode-cn.com/problems/valid-parentheses/
 */
public class isValid {
    HashMap<Character, Character> mappings = new HashMap<Character, Character>(){{
        put(']','[');
        put('}','{');
        put(')','(');
    }};
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (mappings.containsKey(c)) {
                if (res.isEmpty() || !res.peek().equals(mappings.get(c))) return false;
                else res.pop();
            } else {
                res.push(c);
            }
        }
        return res.isEmpty();
    }
    public static void main(String[] args) {
        isValid isValid = new isValid();
        System.out.println(isValid.isValid("]"));
    }
}
