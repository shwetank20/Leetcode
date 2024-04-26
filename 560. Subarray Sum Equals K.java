class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0,max=0,sum=0,n=nums.length;
        HashMap<Integer, Integer> mpp= new HashMap<>();
        mpp.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int remove = sum-k;
            count =count+ mpp.getOrDefault(remove,0);
         //   cnt = cnt+    mpp.getOrDefault(remove, 0);
            mpp.put(sum, mpp.getOrDefault(sum,0) + 1);
            
        }
        return count;
        
    }
}