class Solution {
     List<List<Integer>> ans = new ArrayList<>();
    void func(int i,int[] nums,int n,List<Integer> ds ){
        ans.add(new ArrayList<>(ds));
        
        for(int j=i;j<n;j++){
            ds.add(nums[j]);
            func(j+1,nums,n,ds);
            ds.remove(ds.size()-1);
        }


    }
    public List<List<Integer>> subsets(int[] nums) {
       int n=nums.length;
       // Arrays.sort(nums);
        func(0,nums,n,new ArrayList<>()) ;
        return ans; 
    }
}