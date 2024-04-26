
class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int start=0,end=n-1;
        int i=-1,k=-1;
        
        while(start<=end){
            i=(start+end)/2;
            
            if(nums[i]==target)
            return true;
            if(nums[start]==nums[i] && nums[i]==nums[end]){
                start++;
                end--;
                continue;
            }
            
             if(nums[i]>=nums[start]) //>= is important why?
            {
                if(nums[start]<=target && nums[i]>=target)
                end=i-1;
                else 
                start=i+1;    
            }
            else 
            {
                 if(nums[i]<=target && nums[end]>=target)
                start=i+1;  
               else
                end=i-1;
            }  
                        
        }
        
        
        return false;
    }
    
    

        
}