package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: Luo
 * @description:
 * @time: 2020/12/23 17:14
 * Modified By:
 */
public class t1 {
    public static String fun1(int nums) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0,"");
        hashMap.put(1,"A");
        hashMap.put(2,"B");
        int n = 0;
        StringBuilder s = new StringBuilder();
        while (nums > 26) {
                nums -= 26;
                n++;
                if (n == 26) {
                    s.append(hashMap.get(n));
                    n -= 26;
                }
        }
        s.append(hashMap.get(n));
        s.append(hashMap.get(nums));
        return s.toString();
    }

    public static void main(String[] args) {
    }
}
