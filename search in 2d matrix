class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int index=0;
     for(int i=0;i<matrix.length;i++){
        if(matrix[i][0]<=target){
              index=i;
        }
        else{
            break;
        }
     }
       for(int i=0;i<matrix[index].length;i++){
        if(target==matrix[index][i]){
            return true;
        }
       }
       return false;
    }
}
