import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length; 
        int j=-1,temp;
        for(int i=0;i<n ;i++ ){
            if(nums[i]==0){
            j=i;
            break;}
        }
        if(j==-1)
        
        return ;
        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
            
            
        }
        return;
    }
    
    
}