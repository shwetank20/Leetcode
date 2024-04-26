class Solution {
    public void nextPermutation(int[] nums) { 
        int ind=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverse(nums,0,n-1) ;
            

        }
        else{
            for(int i=n-1;i>ind;i--){
                if(nums[i]>nums[ind]){
                    int temp =nums[i];
                    nums[i]=nums[ind];
                    nums[ind]=temp;
                    break;
                }
            }
            reverse(nums,ind+1,n-1);}


    }
    public void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
    

    public void reverse(int[] A, int i, int j) {
        while(i < j) swap(A, i++, j--);
    }
}