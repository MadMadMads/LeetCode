package leetcode;

/**
 * @author: Luo
 * @description:
 * @time: 2020/10/27 20:45
 * Modified By:
 * 2020年11月28日 冒泡排序没写出来
 */

public class Sort {
    /** 快速排序 **/
    public void quickSort(int[] nums,int left,int right) {
        int i = left,j = right;
        if (i < j) {
            int temp = nums[i];
            while (i < j) {
                while (i < j && nums[j] >= temp) {
                    j--;
                }
                if (i < j) {
                    nums[i++] = nums[j];
                }
                while (i < j && nums[i] < temp) {
                    i++;
                }
                if (i < j) {
                    nums[j--] = nums[i];
                }
            }
            nums[i] = temp;
            quickSort(nums,left,i - 1);
            quickSort(nums,i + 1, right);
        }
    }
    /** 冒泡排序
     * 每次将最大的元素通过交换沉到最后
     * **/
    public void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j + 1] < nums[j]) {
                    int temp = nums[j+1];
                    nums[j +1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
    /**
     *
     * @description: 优化的冒泡排序
     * @author: Luo
     * @time: 2020/11/28 18:07
     */
    public void buubleSort1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean swap = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) break;
        }
    }
    /** 插入排序
     * 默认第一个有序，将后续元素插入到前有续元素之后。
     * **/
    public void insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i],j;
            for (j = i - 1; j >= 0&& nums[j] > temp; j--) {
                nums[j + 1] = nums[j];
            }
            nums[j + 1] = temp;
        }
    }

    /**
     * @description 二分法的直接插入排序
     * @date 2020/11/29 11:26
     * @param
     * @return
     */
    public void insertSort1(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i],left = 0,right = i - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (nums[mid] > temp) right = mid - 1;
                else if (nums[mid] < temp) left = mid + 1;
                else {
                    left = mid + 1;
                }
            }
            for (int j = i - 1; j >= left; j--) {
                nums[j + 1] = nums[j];
            }
            if (left != i) nums[left] = temp;
        }
    }
    /**
     * @description 希尔排序
     * @date 2020/11/29 13:02
     * @param
     * @return
     */
    public void shellSort(int[] nums) {
        for (int d = nums.length / 2; d >0; d--) {
            for (int i = d; i< nums.length; i = i ++) {
                int temp = nums[i],j;
                for (j = i - d;j >= 0 && nums[j] > temp; j = j - d) {
                    nums[j + d] = nums[j];
                }
                nums[j + d] = temp;
            }
        }
    }
    /**
     * 选择排序
     * 每一次遍历待排序的序列，记录最小（大）值的下标，和待排序第一个元素进行比较，如果小（大）与待排序第一个元素，交换
     * **/
    public void selectSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int k = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[k] > nums[j]) k = j;
            }
            if (k != i) {
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
            }
        }
    }
    /**
     * @description 归并排序
     * @date 2020/11/29 13:14
     * @param nums, left, right]
     * @return void
     */
    public void sort(int[] nums,int left,int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            // 不能写成 sort(nums,left,mid - 1);
            //         sort(nums,mid ,right);
            sort(nums,left,mid);
            sort(nums,mid + 1 ,right);
            merge(nums,left,mid,right);
        }
    }
    public void merge(int[] nums,int left,int mid,int right) {
        int[] help = new int[right - left + 1];
        int i = left,j = mid + 1,k = 0;
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) help[k++] = nums[i++];
            else if(nums[i] > nums[j]) help[k++] = nums[j++];
        }
        while (i <= mid) {
            help[k++] = nums[i++];
        }
        while (j <= right) {
            help[k++] = nums[j++];
        }
        for (int n = 0; n < k; n++) {
            nums[left + n] = help[n];
        }
    }
    /**
     * @description 堆排序
     * https://www.cnblogs.com/chengxiao/p/6129630.html
     * @date 2020/12/1 22:43
     * @return void
     */
    public void heapSort(int[] nums) {
        for (int i = nums.length / 2 - 1; i >=0; i--) {
            adjustHeap(nums,i,nums.length);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            adjustHeap(nums,0,i);
        }
    }

    public void adjustHeap(int[] nums,int i,int length) {
        int temp = nums[i];
        for (int k = 2 * i + 1; k < length; k = k * 2 + 1) {
            if (k + 1 < length && nums[k] < nums[k + 1]) k++;
            if (temp < nums[k]) {
                nums[i] = nums[k];
                i = k;
            } else break;
        }
        nums[i] = temp;
    }
    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] nums = new int[]{2,1,3,8,6};
        sort.heapSort(nums);
        System.out.println("");
    }
}
