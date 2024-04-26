class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int start=0,end=n-1;
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