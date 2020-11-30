package leetcode.offer;


/**
 * @author: Luo
 * @description:
 * @time: 2020/11/10 14:54
 * Modified By:
 */

public class Main{
    public static String reverse (String str) {
        if (str.length() <= 1) return str;
        // write code here
        char[] chars = str.toCharArray();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            char c = chars[i];
            chars[i] = chars[j];
            chars[j] = c;
            i++;
            j--;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args)throws Exception{
        String c = reverse("abc");
        System.out.println(c);
    }

}

