class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> st= new HashSet<>(); 
        //Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            Set<Integer> has=new HashSet<>();
            
            for(int j=i+1;j<n;j++){
            int third = -(nums[i]+nums[j]);
            
            if(has.contains(third)==true){
                List<Integer> sum = new ArrayList <>(Arrays.asList(nums[i],nums[j],third));
                Collections.sort(sum);
                st.add(sum);
            }
            has.add(nums[j]);

            }
        }
        List<List<Integer>> arr = new ArrayList <>(st);
    //    for(int i:)

        return arr;        
    }
}