class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    void func(int i,int[] nums,int n,List<Integer> ds ){
        ans.add(new ArrayList<>(ds));
        
        for(int j=i;j<n;j++){
            if(j!=i && nums[j]==nums[j-1]) continue;
            ds.add(nums[j]);
            func(j+1,nums,n,ds);
            ds.remove(ds.size()-1);
        }


    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        func(0,nums,n,new ArrayList<>()) ;
        return ans;
       
        

    }
}