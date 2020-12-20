package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Luo
 * @description:349. 两个数组的交集
 * @time: 2020/12/20 15:52
 * Modified By:https://leetcode-cn.com/problems/intersection-of-two-arrays/
 */
public class T349intersection {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<Integer>();
            Set<Integer> set2 = new HashSet<Integer>();
            for (int num : nums1) {
                set1.add(num);
            }
            for (int num : nums2) {
                set2.add(num);
            }
            return getIntersection(set1, set2);
        }

        public int[] getIntersection(Set<Integer> set1, Set<Integer> set2) {
            if (set1.size() > set2.size()) {
                return getIntersection(set2, set1);
            }
            Set<Integer> intersectionSet = new HashSet<Integer>();
            for (int num : set1) {
                if (set2.contains(num)) {
                    intersectionSet.add(num);
                }
            }
            int[] intersection = new int[intersectionSet.size()];
            int index = 0;
            for (int num : intersectionSet) {
                intersection[index++] = num;
            }
            return intersection;
        }
}
