package leetcode;

import java.util.HashMap;

/**
 * @author: Luo
 * @description:343. 整数拆分
 * @time: 2020/9/29 14:57
 * Modified By:https://leetcode-cn.com/problems/integer-break/
 */
public class integerBreak {
    int[] memory;
    public int integerBreak(int n) {
        memory = new int[n + 1];
        return integerBreak3(n);
    }
    public int integerBreak3(int n) {
        memory[2] = 1;
        for (int i = 3; i <= n; i++) {
            for ( int j = 1; j <= i - 1; j++) {
                memory[i] = Math.max(memory[i], Math.max(j * memory[i - j], j * (i - j)));
            }
        }
        return memory[n];
    }

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1","1");
        hashMap.put("1","2");
        System.out.println(hashMap.get("1"));
    }
}
