class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        Queue<int[]> q = new ArrayDeque<>();
        int[][] direct = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(mat[i][j] == 0){
                    q.add(new int[]{i, j});
                } else {
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        while(!q.isEmpty()){
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];

            for(int[] dir : direct){
                int newrow = r + dir[0];
                int newcol = c + dir[1];

                if(newrow >= 0 && newrow < row && newcol >= 0 && newcol < col &&
                   mat[newrow][newcol] > mat[r][c] + 1){
                    mat[newrow][newcol] = mat[r][c] + 1;
                    q.add(new int[]{newrow, newcol});
                }
            }
        }

        return mat;
    }
}
