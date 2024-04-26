class Solution {
    public boolean canJump(int[] nums) {
    int n=nums.length,k=n-1;
    boolean[] arr= new boolean[n];
    arr[n-1]=true;
   
    for(int i=n-2;i>=0;i--){
      if(i+nums[i]>=k)
      k=i;
      }
// if k==0 then we can reach end from start;
      if(k==0)
      return true;
      return false;
    }
}
 // if no 0's then jump 1 from each to reach end
 // k point to index from which we can reach end in each itration;
 // therefore if we can reach k form i then i becomes k;S