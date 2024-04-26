class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int start=0,end=n-1;
        int i=-1,k=-1;
        
        while(start<=end){
            i=(start+end)/2;
            if(nums[i]==target)
            return i;
            if(nums[i]>=nums[start]) //>= is important why?
            {
                k=bsearch(nums,start,i,target);
                if(k!=-1)
                return k;
                start=i+1;    
            }
            else 
            {
                k=bsearch(nums,i,end,target);
                if(k!=-1)
                return k;
                end=i-1;
            }            
        }
        return -1;
    }
    
    public int bsearch(int[] nums,int start, int end ,int target){
        while(start<=end){
        int i=(start+end)/2;
        if(nums[i]==target)
        return i;
        else if(nums[i]>target)
        end=i-1;
        else 
        start=i+1;
    }
    return -1;

    }

        
}