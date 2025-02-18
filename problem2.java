// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// code along with comments explaining the approach:
// we are checking conditions for being alive or not and using the same space to save updated valus
// with 2 as was 1 but became 0 and 3 as was 0 but became 1.

class Solution {
    int [][] dirs;
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
                    //.           left.  right  up.       down.   up left up r.  down l. down r
        this.dirs = new int [][]{{0,-1}, {0,1}, {-1, 0}, {1,0}, {-1,-1}, {-1,1}, {1,1}, {1,-1}};
        for(int i =0; i<m; i++){
            for(int j=0; j <n; j++){
                int count = countAlive(board, i, j);
                if(board[i][j] == 1 && (count <2 || count>3)) board[i][j] = 2;
                if(board[i][j] == 0 && count ==3) board[i][j] = 3;
            }
        }
        for(int i =0; i<m; i++){
            for(int j=0; j <n; j++){
                if(board[i][j] == 2) board[i][j] = 0;
                if(board[i][j] == 3) board[i][j] = 1;
            }
        }
    }
    private int countAlive(int[][] board, int i, int j){
        int result = 0;
        for(int []dir: dirs){
            int nr = i+dir[0];
            int nc = j+dir[1];
            if(nr>=0 && nc>=0 && nr<board.length && nc<board[0].length && (board[nr][nc]==1 ||board[nr][nc]==2)) result+=1;
        }
        return result;
    }
}