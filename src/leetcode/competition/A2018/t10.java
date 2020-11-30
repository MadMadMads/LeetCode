package leetcode.competition.A2018;

import jdk.nashorn.internal.runtime.FindProperty;

import java.util.Scanner;

/**
 * @author: Luo
 * @description:
 * @time: 2020/10/14 13:38
 * Modified By:
 */
public class t10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),mount = scanner.nextInt();
        double avg = mount*1.0 / n,number = mount;
        double[] money = new double[n];
        for (int i = 0;i < n; i++) {
            money[i] = scanner.nextInt(); }
        while (avg != 0) {
            for (double num : money) {
                if (num <= avg) {num = 0; number-= num;}
                else {
                    num = num - avg;
                    number -= num; }
            }
            avg = number / n;
        }
        double s = 0;
        for (double num : money) {

        }
    }
}
