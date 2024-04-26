// same as book allocation
// but kuch khas samagh mai nahi aaya

class Solution {
    public int countPart(int[] a,int maxSum){
        int n = a.length; 
        int partitions = 1;
        long subarraySum = 0;
        for (int i = 0; i < n; i++) {
            if (subarraySum + a[i] <= maxSum) {
                //insert element to current subarray
                subarraySum += a[i];
            } else {
                //insert element to next subarray
                partitions++;
                subarraySum = a[i];
            }
        }
        return partitions;

    }
    public int splitArray(int[] nums, int k) {
        int start=nums[0];
        int end=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>start)
            start=nums[i];
            end+=nums[i];
        }
        while(start<=end){
            int i=(start+end)/2;
            int x=countPart(nums,i);
            if(x>k)
            start=i+1;
            else 
            end=i-1;
        }
        return start;

        
    }
   
}