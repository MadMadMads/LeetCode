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
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.substring(i,i+1).charAt(0);
            if (c == '[' || c == '{' || c=='(') {
                stack.push(c);
            } else {
                if (!stack.isEmpty() && mappings.get(c).equals(stack.peek())) {stack.pop();}
                else return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        isValid isValid = new isValid();
        System.out.println(isValid.isValid("]"));
    }
}
