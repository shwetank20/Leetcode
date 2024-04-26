class Solution {
    public int[][] merge(int[][] nums) {
       int n=nums.length;
        ArrayList<ArrayList<Integer>> ans =new ArrayList<>();
        Arrays.sort(nums, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        for(int i=0;i<n;){
            int start=nums[i][0];
            int end=nums[i][1];
            int j=i+1;
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }
            while(j<n && nums[j][0]<=end){
                end= (nums[j][1]>end) ?nums[j][1]:end ;
                start=(nums[j][0]<=start) ?nums[j][0]:start ;
                j++;
            }
            ArrayList<Integer> x =new ArrayList<>();
            x.add(start);
            x.add(end);
            ans.add(x);
            i=j;

        }
        int k=ans.size();
        int[][] arr=new int[k][2];
        for(int i=0;i<k;i++){
            arr[i][0]=ans.get(i).get(0);
            arr[i][1]=ans.get(i).get(1);
        }
        //int[][] arr = ans.stream().map(l -> l.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);
        return arr;
    }
}