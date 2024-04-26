class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,maxsum=Integer.MIN_VALUE,j=0,x;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>=maxsum){
                    maxsum=sum;
                    }
            if(sum<0){
                j=i+1;
                sum=0;

            }
            
        }
        return maxsum;
    }
}