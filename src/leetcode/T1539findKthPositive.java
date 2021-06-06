package leetcode;

/**
 * @description: 1539. 第 k 个缺失的正整数
 * @author: Luozhi
 * @create: 2021-03-13 15:30
 * https://leetcode-cn.com/problems/kth-missing-positive-number/
 **/
public class T1539findKthPositive {
    public static int findKthPositive(int[] arr, int k) {
        int current = 1,indexK = 0;
        for (int index = 0; indexK < k; current++) {
            if (index < arr.length && arr[index] == current) {
                index++;
                continue;
            }
            indexK++;
        }
        current--;
        return current;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(nums,k));
    }
}
