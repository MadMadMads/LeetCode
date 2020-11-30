package leetcode.offer;

/**
 * @author: Luo
 * @description:
 * @time: 2020/11/4 21:12
 * Modified By:
 */
public class t33 {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder,0,postorder.length - 1);
    }
    public boolean recur(int[] postorder,int i, int j) {
        if (i >= j) return true;
        int m = i;
        while (postorder[m] < postorder[j]) {m++;}
        int p = m;
        while (postorder[p] > postorder[j]) p++;
        return p == j &&recur(postorder,i,m - 1) && recur(postorder,m,j - 1);
    }

    public static void main(String[] args) {
        t33 t33 = new t33();
        System.out.println(t33.verifyPostorder(new int[] {1,6,3,2,5}));
    }
}
