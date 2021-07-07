package leetcode;

public class T912SortArray {
    public int[] sortArray(int[] nums) {
        if (nums.length == 0) return new int[0];
        quick_sort(nums,0,nums.length - 1);
        return nums;
    }
    public void quick_sort(int[] nums,int left,int right) {
        if (left < right) {
            int l = left,r = right;
            int temp = nums[left];
            while (l < r) {
                while (l < r && temp < nums[r]) r--;
                if (l < r) nums[l++] = nums[r];
                while (l < r && temp > nums[l]) l++;
                if (l < r) nums[r--] = nums[l];
            }
            nums[l] = temp;
            quick_sort(nums,left,l - 1);
            quick_sort(nums,l + 1,right);
        }
    }
}
