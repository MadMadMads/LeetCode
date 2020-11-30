package leetcode;

/**
 * @author: Luo
 * @description:45. 跳跃游戏 II
 * @time: 2020/10/9 19:39
 * Modified By:https://leetcode-cn.com/problems/jump-game-ii/
 */
public class jump {
    public int jump(int[] nums) {
        int start=0,end = 1,step = 0;
        while (end < nums.length) {
            int maxPos = 0;
            for (int i = start; i< end; i++) {
                maxPos = Math.max(maxPos, i + nums[i]);
            }
            start = maxPos; // 下一次起跳点范围开始的格子
            end = maxPos + 1; // 下一次起跳点范围结束的格子
            step++;
        }
        return step;
    }

    public static void main(String[] args) {
        jump jump = new jump();
        System.out.println(jump.jump(new int[]{1,2}));
    }
}
