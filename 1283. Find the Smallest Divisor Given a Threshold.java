import java.lang.Math;
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length,min=nums[0],max=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]>max)
            max=nums[i];
            if(nums[i]<min)
            min=nums[i];
        }
        int start=1,end=max,i=0,ans=max;
        while(start<=end){
            i=(start+end)/2;
            //System.out.println(start+"S "+end+"e ");
            int temp=func(nums,i,threshold);
            if(temp==0){
                start=i+1;

            }
            else{
                end=i-1;
                //ans=i;
                //System.out.println(ans);
            }
            
        }
        return start;
    }
    int func(int[] nums,int x,int th){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(int)Math.ceil((double)nums[i]/(double)x);
            //System.out.println(sum+" "+x+" x");
            if(sum>th)
            break;

        }
        //System.out.println(sum+" "+x+" x");
        if(sum>th)
        return 0;
        return 1;
    }
}