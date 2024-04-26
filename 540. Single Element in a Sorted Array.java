class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        
        int start=0,end=n-1,i=0,ans=-1;
        if(n==1)
        return nums[0];
        while(start<=end){
            i=(start+end)/2;
            if(i==n-1 && nums[i]!=nums[i-1]){
                ans =i;
                break;
            }
            if(i==0 && nums[i]!=nums[i+1]){
                ans=i;
                break;
            }
            if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
            ans=i;
            break;
            }
            if(i%2==0){
                if(nums[i]==nums[i-1])
                end=i-1;
                else 
                start=i+1;

            }
            else 
            {
                if(nums[i]==nums[i-1])
                start=i+1;
                else
                end=i-1;
            }
        }
        return nums[ans];
    }
}