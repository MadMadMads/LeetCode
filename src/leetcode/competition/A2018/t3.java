package leetcode.competition.A2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author: Luo
 * @description:
 * @time: 2020/10/13 15:45
 * Modified By:
 */
public class t3 {
    public static long dfs(long i,long num) {
        if (num / 10 ==0) return num;
        else {
           return dfs(i+1,num /10);
        }
    }
    public static void main(String[] args) {
        try {
            long i = 0;
            long old = dfs(i,5650*4542);
            Scanner in = new Scanner(new File("D:\\work\\study\\letcode\\src\\leetcode\\competition\\A2018\\t3.txt"));
            while (in.hasNextLine()) {
               int first = in.nextInt(); int second = in.nextInt();
               old = dfs(i,(long)(first*second)*old);
               System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

