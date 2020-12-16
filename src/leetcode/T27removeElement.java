package leetcode;

/**
 * @author: Luo
 * @description:27. 移除元素
 * @time: 2020/12/16 17:25
 * Modified By:https://leetcode-cn.com/problems/remove-element/
 */
public class T27removeElement {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
}
