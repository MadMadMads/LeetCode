package leetcode;

/**
 * @author: Luo
 * @description:215. 数组中的第K个最大元素
 * @time: 2021/1/3 10:34
 * Modified By:https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 */
public class T215findKthLargest {
    // 快排做法
    public int findKthLargest(int[] nums, int k) {
        int index = nums.length - k;
        return quick(nums,0,nums.length - 1,index);
    }
    public int quick(int[] nums,int left,int rihgt,int index) {
        int i = quick_sort(nums,left,rihgt);
        if (i == index) return nums[i];
        else if (i < index) return quick(nums,i + 1,rihgt,index);
        else return quick(nums,left,i - 1,index);
    }
    public int quick_sort(int[] nums,int left,int right) {
        if (left < right) {
            int temp = nums[left];
            int i = left,j = right;
            while (i < j) {
                while (i < j && temp < nums[j]) j--;
                if (i < j) nums[i++] = nums[j];
                while (i < j && temp > nums[i]) i++;
                if (i < j) nums[j--] = nums[i];
            }
            nums[i] = temp;
            return i;
        }
        return left;
    }

    // 堆排
    public int findKthLargest1(int[] nums, int k) {
        for (int i = nums.length / 2 - 1;i >=0;i--) {
            adjustHeap(nums,i,nums.length);
        }
        int length = nums.length - 1;
        for (int i = 1; i < k; i++) {
            int temp = nums[0];
            nums[0] = nums[length];
            nums[length] = temp;
            adjustHeap(nums,0,length);
            length--;
        }
        return nums[0];
    }
    public void adjustHeap(int[] nums,int i,int length) {
        int temp = nums[i];
        for (int k = 2 * i + 1; k < length;k = k * 2 + 1) {
            if (k + 1 < length && nums[k] < nums[k + 1]) {
                k++;
            }
            if (temp < nums[k]) {
                nums[i] = nums[k];
                i = k;
            } else break;
        }
        nums[i] = temp;
    }

    public static void main(String[] args) {
    T215findKthLargest t215findKthLargest = new T215findKthLargest();
    System.out.println(t215findKthLargest.findKthLargest1(new int[]{3,2,3,1,2,4,5,5,6},1));
    }
}
