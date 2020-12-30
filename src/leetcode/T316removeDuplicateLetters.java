package leetcode;

import java.util.Stack;

/**
 * @author: Luo
 * @description:316. 去除重复字母
 * @time: 2020/12/30 20:55
 * Modified By:https://leetcode-cn.com/problems/remove-duplicate-letters/
 */
public class T316removeDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[256];
        boolean[] inStack = new boolean[256];
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            count[ch]++;
        }
        for (char ch : chars) {
            count[ch]--;
            if (inStack[ch]) continue;
            while (!stack.isEmpty() && stack.peek() > ch) {
                if (count[stack.peek()] == 0) break;
                inStack[stack.pop()] = false;
            }
            inStack[ch] = true;
            stack.push(ch);
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}
