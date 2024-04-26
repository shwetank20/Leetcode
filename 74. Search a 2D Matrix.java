class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        int start=0,end=m-1,i=0,ans=0;
        while(start<=end){
            i=(start+end)/2;
           // System.out.println(i);
            if(matrix[i][0]==target)
            return true;
            else if(matrix[i][0]<target){
                ans=i;
                start=i+1;
            }
            else{
                end=i-1;
            }

        }
        //System.out.println(matrix[ans][0]);
        start=0;
        end=n-1;
        while(start<=end){
            i=(start+end)/2;
            if(matrix[ans][i]==target)
            return true;
            else if(matrix[ans][i]>target){
                end=end-1;
                
            }
            else 
            start=i+1;
        }
        return false;
        // return false;
    }
   
}