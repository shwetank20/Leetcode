class Solution {
    public int findKthPositive(int[] nums, int k) {
        int n=nums.length,max=nums[n-1],j=1;
        if(nums[n-1]==n){
            j=n+k;
            return j;
        }
       // if()
        int start=0,end=n-1,i=0;
        while(start<=end){
            i=(start+end)/2;
            if(k>nums[i]-i-1){
                start=i+1;
            }
            else {
                end=i-1;
            }
           

        }

      // System.out.println(nums[end]);
       //System.out.println((nums[end]-end-1));
       // if(end==-1){
        //System.out.println(end);// 
        //return end+1+k;}
        //cant use //nums[end]+(k-(nums[end]-end-1)) as if end=-1 then array index out of bound
        // nums[end]+(k-(nums[end]-end-1)) = nums[end]-nums[end]+k+end+1=end+1+k
        return end+1+k;
    }
}