package leetcode.alibaba;

import leetcode.Main;

import java.awt.font.NumericShaper;
import java.util.Scanner;

/**
 * @description:
 * @author: Luozhi
 * @create: 2021-03-21 16:29
 **/
public class T0315A {

    public static void main(String[] args) {
        int a = 2,b = 5,c =6;
        int num = 0;

        while (c != 0) {
            int ai = 0,bi = 0,ci = 0;
            ai = 1 & a;
            ci = 1 & c;
            bi = 1 & b;
            if (a != 0) {
                a = a >>1;
            }
            if (b != 0) {
                b = b >> 1;
            }
            if (ci == 1 && ai != 1 && bi != 1) num++;
            else if (ci == 0) {
                if (ai == 1) {
                    num++;
                }
                if (bi ==1) {
                    num++;
                }
            }
            c = c>>1;
        }
        System.out.println(num);
    }
}
