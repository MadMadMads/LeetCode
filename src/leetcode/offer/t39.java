package leetcode.offer;

import java.util.HashMap;

/**
 * @author: Luo
 * @description:剑指 Offer 39. 数组中出现次数超过一半的数字
 * @time: 2020/6/3 19:55
 * Modified By:https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
 */
public class t39 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int key = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num,1);
                if (max < 1) {
                    key = num;
                }
            } else {
                int res = hashMap.get(num)+1;
                if (res > max) {
                    key = num;
                    max = res;
                }
                hashMap.put(num,res);
            }
        }
        return key;
    }
}
