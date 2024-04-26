class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> nums=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> temp=new ArrayList<>();
           if(i==1)
           temp.add(1);
           else if(i==2){
           temp.add(1);
           temp.add(1);
           }
           else{
               temp.add(1);
               int x=1;
               for(int j=1;j<i-1;j++){
                   x=x*(i-j);
                   x=x/(j);      
                   temp.add(x);
               }
               temp.add(1);
           }
            nums.add(temp);
        }
        return nums;
    }    
}