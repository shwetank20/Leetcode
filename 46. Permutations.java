class Solution {
    public void func(int ind,int[] nums,List<List<Integer>> ans){
        
        if(ind==nums.length){
            //copy to ds
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }

            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<nums.length;i++){
            swap(nums,ind,i);
            func(ind+1,nums,ans);
            swap(nums,ind,i);
        }
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans= new ArrayList<>();
        func(0,nums,ans);
        return ans;

        
    }
}