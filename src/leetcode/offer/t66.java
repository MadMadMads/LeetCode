package leetcode.offer;

import com.sun.glass.ui.Size;

/**
 * @author: Luo
 * @description:
 * @time: 2020/11/17 14:22
 * Modified By:
 */
public class t66 {
    public int[] constructArr(int[] a) {
        if (a.length == 0) return new int[0];
        int[] b = new int[a.length];
        int temp = 1;
        b[0] = 1;
        for (int i = 1; i < a.length; i++) {
            b[i] = b[i - 1] * a[i -1];
        }
        for (int i = a.length - 2; i >=0; i--) {
            temp = temp * a[i + 1];
            b[i] = temp * b[i];
        }
        return b;
    }

    public static void main(String[] args) {
        char c = 'z';
    }
}
