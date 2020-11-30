package leetcode;

/**
 * @author: Luo
 * @description:
 * @time: 2020/4/18 21:35
 * Modified By:
 */
public class isPalindrome {
    public static boolean isPalindrome(int x) {
       if (x < 0) return false;
       int res = 0;
       while (x != 0) {
           res = res * 10 + x%10;
           x /= 10;
       }
       return x==res;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
