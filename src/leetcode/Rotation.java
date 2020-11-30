package leetcode;

/**
 * @author: Luo
 * @description:
 * @time: 2020/9/27 19:55
 * Modified By:
 */
public class Rotation {
    int[][] Rotation1(int arr[][])
    {
        int[][] tmp =new int[arr[0].length][arr.length];
        int dst=arr.length-1;
        //顺时针旋转矩阵90度
        for(int i=0;i<arr.length;i++,dst--)
            for(int j=0;j<arr[0].length;j++)
                tmp[j][dst]=arr[i][j];
        return tmp;
    }
    int[][] Rotation2(int arr[][])
    {
        int[][] tmp =new int[arr[0].length][arr.length];
        //逆时针旋转矩阵90度
        for(int i=0;i<arr.length;i++)
            for(int j=0,dst=arr[0].length-1;j<arr[0].length;j++,dst--)
                tmp[dst][i]=arr[i][j];
        return tmp;
    }
    void Rotation3(int arr[][]) {
        // 水平
        int Row = arr.length,Col = arr[0].length;
        for (int i = 0,j = Col -1; i < j ; i++, j--) {
            for (int r = 0; r < Row; r ++) {
                int temp = arr[r][i];
                arr[r][i] = arr[r][j];
                arr[r][j] = temp;
            } }
    }

    public static void main(String[] args) {
        Rotation Rotation = new Rotation();
        int[][] arr = new int[][]{{1,2},{3,4},{5,6}};
        int[][] temp = Rotation.Rotation1(arr);
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length;j++)
                System.out.print(temp[i][j]);
            System.out.println();
        }
    }
}
