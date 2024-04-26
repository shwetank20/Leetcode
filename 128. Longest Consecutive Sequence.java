class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int count=1,max=1;
        if(n==0)
        return 0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]+1 == nums[i+1]){
                count++;
                max=count>max?count:max;
                //System.out.println(count);
            }
            else if(nums[i]==nums[i+1]);
            else{
                

                count=1;
            }

        } 
        return max;
    }
}