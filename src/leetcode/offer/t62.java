package leetcode.offer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author: Luo
 * @description:剑指 Offer 62. 圆圈中最后剩下的数字
 * @time: 2020/11/25 12:43
 * Modified By:https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/
 */
public class t62 {
    //  超时
    /*public static int lastRemaining(int n, int m) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.addLast(i);
        }
        int i = 0;
        while (list.size() != 1) {
            int count = 1;
            while (count != m) {
                if (i >= list.size()) i = 0;
                count++;
                i++;
                if (i >= list.size()) i = 0;
            }
            list.remove(i);
        }
        return list.getFirst();
    }*/
    public static int lastRemaining(int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int index = 0;
        while (list.size() != 1) {
            index  = (index + m - 1) % list.size();
            list.remove(index);
        }
        return list.get(0);
    }


    public static void main(String[] args) {
        System.out.println(lastRemaining(10,17));
    }
}
