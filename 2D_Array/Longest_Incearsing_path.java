class Solution {
    private static final int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
    private int row, col;
    public int longestIncreasingPath(int[][] matrix) {
        row = matrix.length;
        col = matrix[0].length;
        int max=0;
        int[][] path = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                max = Math.max(max, DFS(matrix,i,j,path));
            }
        }
        return max;
    }

    private int DFS(int[][] matrix, int i, int j, int[][] path){
        if(path[i][j]!=0)
            return path[i][j];
        int max=1;
        for(int[] d : dirs){
            int ni = i+d[0];
            int nj = j+d[1];
            if(ni>=0 && ni<row && nj>=0 && nj<col && matrix[i][j]<matrix[ni][nj])
                max = Math.max(max, 1+DFS(matrix,ni,nj,path));
        }
        return path[i][j] = max;
    }

    
}
