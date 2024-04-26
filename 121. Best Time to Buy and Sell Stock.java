class Solution {
    public int maxProfit(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        int max=nums[0],ans=0,x=0;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                max=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
            ans=max-min;
            x=ans>x?ans:x;
        }
        return x;
    }
}