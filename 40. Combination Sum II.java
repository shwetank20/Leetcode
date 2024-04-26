
class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void func(int i,int[] nums,int target,List<Integer> ds){
        if(target==0){
            ans.add(new ArrayList<>(ds));
           // System.out.println(ds);
            return;
        }
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]) continue;
            if(nums[j]>target) break;

            ds.add(nums[j]);
            func(j+1,nums,target-nums[j],ds);
            ds.remove(ds.size()-1);
          
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        func(0,candidates,target,new ArrayList<Integer>());
        
        return ans;
    }
}