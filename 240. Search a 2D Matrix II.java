class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length,m=matrix.length;
        int row=0,col= n-1;
        while(row<m && col>=0){

            if(matrix[row][col]==target)
            return true;
            else if(matrix[row][col]<target)
            row++;
            else 
            col--;
        
        }
        return false;
    }
}