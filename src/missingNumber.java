import java.util.Arrays;

/**
 * @author: Luo
 * @description:268. 丢失的数字
 * @time: 2020/12/11 17:23
 * Modified By:https://leetcode-cn.com/problems/missing-number/
 */
public class missingNumber {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (nums[0] != 0) return 0;
        if (nums[nums.length -1] != n) return n;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0,1}));
    }
}
