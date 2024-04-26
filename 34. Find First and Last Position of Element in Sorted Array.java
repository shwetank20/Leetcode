class Solution {
    public int[] searchRange(int[] nums, int target) {
    int n= nums.length;
    int start=0,end=n-1,ans=-1,count=-1; 
    int i=0;  
    while(start<=end){
        i=(start+end)/2;
        if(nums[i]==target){
        ans=i;
        end=i-1;
        }

        else if(nums[i]>target){
        //ans=i;
        end=i-1;
        }
        else
        start=i+1;
    }
     start=0;
     end=n-1;
    while(start<=end){
        i=(start+end)/2;
        if(nums[i]==target){
        count=i;
        start=i+1;
        }
        else if(nums[i]<target){
       // count=i;
        start=i+1;
        }
        else
        end=i-1;
    }
    int[] arr=new int[2];
    arr[0]=ans;
    arr[1]=count;
    return arr;

    }
}