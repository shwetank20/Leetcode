class Solution {
    public void sortColors(int[] nums) {
        int[] arr=new int[3];
        int n=nums.length;
        for(int i=0;i<3;i++){
            arr[i]=0;
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0)
            arr[0]++;
            if(nums[i]==1)
            arr[1]++;
            else 
            arr[2]++;
        }
        int j=0,i=0;
        while(i<n){
        while(arr[j]!=0 && i<n){
            nums[i++]=j;
            arr[j]--;
        }
        j++;
        }
        
    }
}