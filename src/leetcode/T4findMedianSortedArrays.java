package leetcode;

/**
 * @author: Luo
 * @description:4. 寻找两个正序数组的中位数
 * @time: 2020/12/17 14:26
 * Modified By:https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 */
public class T4findMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left = (nums1.length +  nums2.length + 1) / 2;
        int right = (nums1.length +  nums2.length + 2) / 2 ;
        return (getK(nums1,0,nums1.length - 1,nums2,0,nums2.length - 1,left) +
                getK(nums1,0,nums1.length - 1,nums2,0,nums2.length - 1,right)) * 0.5;
    }
    public int getK(int[] nums1,int start1,int end1,int[] nums2,int start2,int end2,int k) {
        int len1 = end1 - start1 + 1, len2 = end2 - start2 + 1;
        if (len1 > len2) return getK(nums2,start2,end2,nums1,start1,end1,k);
        if (len1 == 0) return nums2[start2 + k - 1];
        if (k == 1) return Math.min(nums1[start1],nums2[start2]);
        int i = start1 + Math.min(len1,k / 2) - 1;
        int j = start2 + Math.min(len2,k / 2) - 1 ;
        if (nums1[i] > nums2[j]) {
            return getK(nums1,start1,end1,nums2,j + 1,end2,k - (j - start2 + 1));
        } else {
            return getK(nums1,i + 1,end1,nums2,start2,end2,k - (i - start1 + 1));
        }
    }
    public static void main(String[] args) {
        T4findMedianSortedArrays t4findMedianSortedArrays = new T4findMedianSortedArrays();
        System.out.println(t4findMedianSortedArrays.findMedianSortedArrays(new int[]{1,1,3,3},new int[]{1,1,3,3}));
    }
}
