class Solution {
    public int findPeakElement(int[] nums) {
        int start=0,n=nums.length,end=n-1;
        int i=0,max=0;
        if(n==1)
        return 0;
        if(nums[0]>nums[1])
        return 0;
        if(nums[n-1]>nums[n-2])
        return n-1;

        while(start<=end){
            i=(start+end)/2;
            if(nums[i]>nums[max]){
            max=i;
            //System.out.println(max);
            }
            if(nums[start]>nums[i]){
                end=i-1;
            }
            else if(nums[end]>nums[i]){
                start=i+1;
            }
            else{
                start++;
                end--;
            }
        }
        return max;
    }
}