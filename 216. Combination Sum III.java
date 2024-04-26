class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void func(int i,int k,int target,List<Integer> ds){
        //if(ds.size()>k) return;
        if(k==0 && target==0){
                ans.add(new ArrayList<>(ds));
                return;
                
            }
        for(int j=i;j<=9;j++){
            ds.add(j);
            func(j+1,k-1,target-j,ds);
            ds.remove(ds.size()-1);
            //func(i+1,k,target,ds);
        }        
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        func(1,k,n,new ArrayList<>() );
        return ans;
    }
}