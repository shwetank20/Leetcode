
class Solution {
   
    public void func(int i,int[] nums,int n,int target,int sum,List<Integer> x,List<List<Integer>> ans){
        
        if(i==n){
            if( sum==target){
                ans.add(new ArrayList<>(x));                
            }
            return;
        }
            if(nums[i]<=target-sum){
            sum+=nums[i];
            x.add(nums[i]);
            func(i,nums,n,target,sum,x,ans);
            x.remove(x.size()-1);
            sum-=nums[i];
            }
            

          //  x.remove(x.size()-1);
            //sum-=nums[i];
            func(i+1,nums,n,target,sum,x,ans);
        

        return;

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
         List<List<Integer>> ans=new ArrayList<>();
        func(0,candidates,n,target,0,new ArrayList<Integer>(),ans);
        System.out.println(ans);
        return ans;
        
    }
}