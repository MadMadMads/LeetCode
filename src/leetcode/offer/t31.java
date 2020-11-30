package leetcode.offer;

import java.util.Stack;

/**
 * @author: Luo
 * @description:
 * @time: 2020/11/12 16:02
 * Modified By:
 */
public class t31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length != popped.length) return false;
        Stack<Integer> stack = new Stack<>();
        int j = 0,i = 0;
       while (i < pushed.length) {
           stack.push(pushed[i]);
            while (!stack.isEmpty() && j != popped.length && stack.peek() == popped[j] ) {
                stack.pop();
                j++;
            }
            i++;
        }
        return j == popped.length;
    }

    public static void main(String[] args) {
        t31 t31 = new t31();
        System.out.println(t31.validateStackSequences(new int[]{1,0},new int[]{1,0}));
    }
}
