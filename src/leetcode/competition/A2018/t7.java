package leetcode.competition.A2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author: Luo
 * @description:
 * @time: 2020/10/13 20:33
 * Modified By:
 */
public class t7 {
    static boolean[][] flag;
    public static boolean check(int i,int j) {
        if (i >= flag.length || i < 0 || j >= flag[0].length || j < 0 || flag[i][j] == true) return false;
        return true;
    }
    public static void dfs(char[][] chars,int i,int j) {
        if (check(i,j)) {
            flag[i][j] = true;
            if (chars[i][j] == '#') {
                dfs(chars,i-1,j);
                dfs(chars,i+1,j);
                dfs(chars,i,j+1);
                dfs(chars,i,j-1);
            } }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("D:\\work\\study\\letcode\\src\\leetcode\\competition\\A2018\\t7.txt"));
        int n = 7;
        char[][] chars = new char[n][n];
        flag = new boolean[n][n];
        int num = 0;
        for (int i = 0; i < n; i++) {
            chars[i] = scanner.nextLine().toCharArray();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                if (chars[i][j] == '#' && flag[i][j] == false) {
                    //flag[i][j] = true;
                    dfs(chars,i,j);
                    num++;
                }
            }}
        System.out.println(num);
        //for (int i = 0; i < n; i++) {
        //    for (int j = 0; j <n; j++) {
        //        if (chars[i][j] == '#') {
        //        } } }
    }
}
