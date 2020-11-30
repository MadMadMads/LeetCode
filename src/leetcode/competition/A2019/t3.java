package leetcode.competition.A2019;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author: Luo
 * @description:迷宫问题
 * @time: 2020/10/10 19:26
 * Modified By:
 */
public class t3 {
    int[] X = { 1, 0, 0, -1 };
    int[] Y = { 0, -1, 1, 0 };
    public String[] dir = {"D","L","R","U"};//下左右上
    public static LinkedList<String> list = new LinkedList();
    public boolean check(int[][] nums,int x,int y) {
        if (x < 0 || x >= nums.length || y < 0 || y >= nums[0].length) return false;
        if (nums[x][y] == 1 || nums[x][y] == 5) return false;
        return true;
    }
    public void dfs(int[][] nums,int x,int y) {
        if (x == nums.length -1 && y == nums[0].length - 1) {
            System.out.println(list.toString());
        }
        for (int i = 0; i < 4; i++) {
            int NewX = x + X[i];
            int newY = y + Y[i];
            if (check(nums,NewX,newY)) {
                list.addLast(dir[i]);
                nums[x][y] = 5;
                dfs(nums,NewX,newY);
                nums[x][y] = 0;
                list.removeLast();
            } }
    }

    public static void main(String[] args) {
        t3 t3 = new t3();
        int[][] array = {
                {0, 0, 1, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 1, 1, 0, 1},
                {0, 1, 1, 1, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 1},
                {0, 1, 1, 1, 1, 0, 0, 1},
                {1, 1, 0, 0, 0, 1, 0, 1},
                {1, 1, 0, 0, 0, 0, 0, 0}};
        t3.dfs(array,0,0);
    }
}
