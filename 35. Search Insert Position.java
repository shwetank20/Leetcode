class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int start=0,end=n-1;
        int i=(start+end)/2,ans=n;
        while(start<=end){
            i=(start+end)/2;
            if(nums[i]==target)
            return i;
            else if(nums[i]<target)
            start=i+1;
            else
            {
                ans=i;
                end=i-1;
            }
        }
        return ans; 

    }
}