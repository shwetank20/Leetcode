class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int start=0,end=n-1;
        int i=-1,k=-1,min=nums[0];
        // in BS think whic side to eliminat 
        //find patterns
        while(start<=end){
            i=(start+end)/2;
            if(nums[i]<min)
            min=nums[i];
            if(nums[i]>=nums[0]) //>= is important why?
            {
                start=i+1;
            }
            else 
            {
                end=i-1;
            }            
        }
        return min; 
    }
}