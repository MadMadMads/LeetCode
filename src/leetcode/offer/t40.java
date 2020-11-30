package leetcode.offer;

/**
 * @author: Luo
 * @description:剑指 Offer 40. 最小的k个数
 * @time: 2020/6/1 22:00
 * Modified By:https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
 */
public class t40 {
    public int quick_sort(int[] arr, int l, int r) {
        if (l < r) {
            int i = l,j = r,temp = arr[i];
            while (i < j) {
                while (i < j && arr[j] > temp) j--;
                if (i < j) {
                    arr[i++] = arr[j];
                }
                while (i < j && arr[i] < temp) i++;
                arr[j] = arr[i];
                if (i < j) {
                    arr[j--] = arr[i];
                }
            }
            arr[i] = temp;
            return i;
        }
        return l;
    }
    public void partitionArray(int[] arr, int lo, int hi, int k) {
        int m = quick_sort(arr,lo,hi);
        if (m == k) return;
        else if (m < k) {
            partitionArray(arr,m+1,hi,k);
        } else {
            partitionArray(arr,lo,m-1,k);
        }
    }
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length == 0 || k ==0) return new int[0];
        quick_sort(arr,0,arr.length - 1);
        return arr;
    }
    public static void main(String[] args) {
        t40 t40 = new t40();
        int[] n = {4,2,3,1};
        int[] m = t40.getLeastNumbers(n,0);
        System.out.println(m);
    }
}
