package leetcode;

/**
 * @author: Luo
 * @description:
 * @time: 2020/10/8 13:47
 * Modified By:
 */
public class balancedStringSplit {
    public int balancedStringSplit(String s) {
        int num = 0;
        int res = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'L')
                num++;
            else
                num--;
            if(num == 0)
                res++;
        }
        return res;
    }
}
