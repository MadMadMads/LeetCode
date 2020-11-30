package leetcode.competition.A2018;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: Luo
 * @description:
 * @time: 2020/10/14 10:12
 * Modified By:
 */
public class t9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(),K=scanner.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            int j = scanner.nextInt();
            nums[i] = j;
        }
        int res = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j =i + 1; j < N -1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum % K ==0) {
                        res = Math.max(res,sum);
                    }
                } } }
        System.out.println(res);
    }
}
