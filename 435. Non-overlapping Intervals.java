class comp implements Comparator<int[]> {
 
    
    public int compare(int[] a, int[] b) {
               // if(a[0]!=b[0])
                return a[0] - b[0];
            //    else 
              //  return a[1]-b[1];
              // no need to sort based on 2nd val
            }
}
class Solution {
    public int eraseOverlapIntervals(int[][] nums) {
        int n=nums.length,cnt=0;
        Arrays.sort(nums, new comp());
        
        int end=nums[0][1];

        for(int i=1;i<n;i++){
            if(nums[i][0]<end){
                cnt++;
                if(nums[i][1]<end)
                end=nums[i][1];
            }
            else
            end=nums[i][1];    
        }

        return cnt; 
    }
} 