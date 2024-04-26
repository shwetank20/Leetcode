class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0,num=nums[0];
        for(int i=0;i<n;i++){
            if(count==0){
                num=nums[i];
                count++;
            }
            else if(nums[i]==num)
            count++;
            else
            count--;
        }

        return num;
    }
}