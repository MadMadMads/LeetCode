package leetcode.alibaba;

import leetcode.offer.MaxQueue;

import java.util.Scanner;

public class Main {
    public static int n;
    public static int[][] nums = new int[550][550];
    public static int[] a = new int[550];

    public static int dp(int l,int r) {
        if (l == r) return 0;
        if (nums[l][r] != 0) return nums[l][r];
        for (int i = l; i <= r; i++) {
            dp(l,i);
            dp(i + 1,r);
            if (a[i] - a[l - 1] > a[r] - a[i]) {
                nums[l][r] = Math.max(nums[l][r],a[r] - a[i] + nums[i + 1][r]);
            } else if (a[i] - a[l-1] < a[r] - a[i]) {
                nums[l][r] = Math.max(nums[l][r],a[i] - a[l-1] + nums[l][i]);
            } else {
                nums[l][r] = Math.max(nums[l][r] ,Math.max(nums[l][i] + a[i] - a[l-1],nums[i + 1][r] + a[r] - a[i]));
            }
        }
        return nums[l][r];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 1;i <= n; i++) {
                a[i] =0;
                for (int j = 1; j <= n; j++) {
                    nums[i][j]= 0;
                }
            }
            for (int i = 1;i <= n;i++) {
                a[i] = sc.nextInt();
                a[i] += a[i - 1];
            }
            dp(1,n);
            System.out.println(nums[1][n]);
        }
    }

    public static int fun1(int[] nums,int sum) {
        int n = nums.length;
        int[] dp = new int[sum+1];
        dp[0] = 1;
        for (int i = 1; i <= n;i ++ ){
            for (int j = sum; j >= 0; j--) {
                if (j >= nums[i - 1]) {
                    dp[j] = dp[j] + dp[j-nums[i - 1]];
                } else {
                    dp[j] = dp[j];
                }
            }
        }
        return dp[sum];
    }
}


   /* int[] dp = new int[10000];
           dp[0] = 1;
                   for (int i = 1; i <= n; i++) {
                   for (int j = m; j >=w[i]; j--) {
                   if (dp[j - w[i]] == 1) {
                   dp[j] = 1;
                   }
                   }
                   }
                   if (dp[m] == 1) {
                   System.out.println("YES");
                   } else {
                   System.out.println("NO");
                   }*/