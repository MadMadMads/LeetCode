package leetcode.offer;

/**
 * @author: Luo
 * @description:调整数组顺序使奇数位于偶数前面
 * @time: 2020/6/21 16:52
 * Modified By:https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 */
public class t21 {
    public int[] exchange(int[] nums) {
        int j = nums.length -1;
       for (int i = 0; i < nums.length&& i < j; i++) {
           if (nums[i] % 2 == 0) {
               while (nums[j] % 2 == 0 && i < j) {
                   j--;
               }
               int temp = nums[i];
               nums[i] = nums[j];
               nums[j] = temp;
           }
       }
       return nums;
    }

    public static void main(String[] args) {
        t21 t21 = new t21();
        int[] n = {2,4,6};
        t21.exchange(n);
    }
}
