package leetcode.offer;

import java.nio.charset.Charset;

/**
 * @author: Luo
 * @description:剑指 Offer 45. 把数组排成最小的数
 * @time: 2020/6/2 22:12
 * Modified By:https://leetcode-cn.com/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/
 */
public class t45 {
    public void quick_sort(String[] strs,int l, int r) {
        if (l < r) {
            int i = l ,j = r;
            String temp = strs[i];
            while (i < j) {
                if ( i < j && (temp + strs[j]).compareTo(strs[j]+temp) <= 0) {
                    j--;
                }
                if (i < j) {
                    strs[i] = strs[j];
                }
                if ( i < j && (temp + strs[j]).compareTo(strs[j]+temp) >= 0) {
                    i++;
                }
                if (i < j) {
                    strs[j] = strs[i];
                }
            }
            strs[i]=temp;
            quick_sort(strs,l,i-1);
            quick_sort(strs,i+1,r);
        }
    }
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        quick_sort(strs,0,strs.length-1);
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strs) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        t45 t45 = new t45();
        int[] nums = {20,1};
        System.out.println(t45.minNumber(nums));
    }
}
