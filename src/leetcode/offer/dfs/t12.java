package leetcode.offer.dfs;

/**
 * @author: Luo
 * @description:矩阵中的路径
 * @time: 2020/6/14 13:30
 * Modified By:https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/
 */
public class t12 {
    private int[][] direct = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    private boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        this.visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
               if (dfs(board, i, j, word, 0)) return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int x, int y, String word, int index) {
        if (index == word.length()) return true;
        if (word.charAt(index) == board[x][y]) {
            if (index + 1 == word.length()) {
                return true;
            }
            visited[x][y] = true;
            for (int i = 0; i< 4; i++) {
                int newX = x + direct[i][0];
                int newY = y + direct[i][1];
                if (inArea(newX, newY, board.length, board[0].length)
                        && visited[newX][newY] == false && dfs(board,newX,newY,word,index+1)) {
                    return true;
                }
            }
            visited[x][y] = false;
        }
        return false;
    }
    private boolean inArea(int x, int y, int row, int col) {
        return x >= 0 && y >= 0 && x < row && y < col;
    }

public static void main(String[]args){
        t12 t12=new t12();
        char[][]chars=new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(t12.exist(chars,"ABCCED"));
        }
}



