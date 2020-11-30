package leetcode;

/**
 * @author: Luo
 * @description:55. 跳跃游戏
 * @time: 2020/10/7 16:00
 * Modified By:https://leetcode-cn.com/problems/jump-game/
 */
public class canJump {
    public boolean canJump(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            int max = nums[i] + i;
            for (int j = i + 1; j <= i + max; j++) {
                if (j >= length - 1) return true;
                max = max > j + nums[j] ? max : j + nums[j];
            }
            i = max;
            if (i >= length -1) return true;
            if (nums[i] == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        canJump canJump = new canJump();
        System.out.println(canJump.canJump(new int[]{2,0,0}));
    }
}
