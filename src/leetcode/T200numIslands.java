package leetcode;

/**
 * @author: Luo
 * @description:200. 岛屿数量
 * @time: 2021/1/3 14:59
 * Modified By:https://leetcode-cn.com/problems/number-of-islands/
 */
public class T200numIslands {
    public boolean check(char[][] grid,int i,int j) {
        if (i >=0 && i <grid.length && j >= 0 && j < grid[0].length && grid[i][j] == '1') return true;
        return false;
    }
    int res = 0;
    public void dfs(char[][] grid,int i,int j) {
        if (check(grid,i,j)) {
            grid[i][j] = '2';
            dfs(grid, i + 1, j);
            dfs(grid, i, j + 1);
            dfs(grid, i - 1, j);
            dfs(grid, i, j - 1);
        }
    }
    public int numIslands(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (check(grid,i,j)) {
                    res++;
                    dfs(grid,i,j);
                } } }
        return res;
    }

    public static void main(String[] args) {
        T200numIslands t200numIslands = new T200numIslands();
        System.out.println(t200numIslands.numIslands(new char[][] {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}}));
    }
}