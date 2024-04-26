class Solution {
    public int minDays(int[] nums, int m, int k) {
        int n=nums.length,min=nums[0],max=nums[0];
        
        for(int i=0;i<n;i++){
            if(nums[i]>max)
            max=nums[i];
            if(nums[i]<min)
            min= nums[i];

        }
        if(n<m*k)
        return -1;

        
        
        int start=min,end=max,i=0,ans=-1;
        while(start<=end){
            i=(start+end)/2;
       
            if(func(nums,i,k,m)==true){
                ans=i;
                end=i-1;
             
            
            }
            else
            start=i+1;      
    }

    return ans;
    
    }
    boolean func(int[] nums,int x,int k,int m ){
         int count=0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=x)
            count++;
            else{
               ans+=count/k;
                count=0;
            }
        }
        ans+=count/k;
        if(ans>=m)
        return true;
        return false;
        

    }
}