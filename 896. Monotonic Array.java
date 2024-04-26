class Solution {
    public boolean isMonotonic(int[] nums) {
        int i=0,j=1,n=nums.length;
        while(j<n && nums[i]==nums[j]){
            i++;
            j++;
        }
        if(j==n) return true;
        if(nums[i]>nums[j]){
            while(j<n && nums[i]>=nums[j]){
                i++;
                j++;
            }
            if(j<n && nums[i]<nums[j]) return false;
        }
        else{
            while(j<n && nums[i]<=nums[j]){
                i++;
                j++;
            }
            if(j<n &&nums[i]>nums[j]) return false;

        }

        return true;
    }

}