package leetcode.alibaba;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Vector;

/**
 * @description: 3月19日 A题
 * @author: Luozhi
 * @create: 2021-03-21 10:50
 **/
public class T0319A {
    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean judge(int n) {
        int min = Integer.MAX_VALUE;
        for (int i = n / 2; i > 0; i--) {
            if (Math.pow(i, 2) == n) {
                list.add(0);
                return true;
            } else {
                min = Math.min(min, Math.abs(n - i * i));
            }
        }
        list.add(min);
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 7, 12, 13};
        for (int n : nums) {
            judge(n);
        }
        Arrays.sort(list.toArray());
        System.out.println(list.toString());
    }
}
