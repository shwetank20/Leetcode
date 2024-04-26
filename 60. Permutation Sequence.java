class Solution {
   
    public String getPermutation(int n, int k) {
        List<Integer> num=new ArrayList<>();
        int fact=1;
        // finding n-1 factorial and adding n numbers to array
        //n=4 thus fact=6(3!)
        for(int i=1;i<n;i++){
            fact*=i;
            num.add(i);
        }
        num.add(n);
        //given k is in 1 based indexing
        // converting k to 0 based indexing 
        // if k=17 then k becomes 16
        k=k-1;

        String ans="";
        while(true){
            // dry run with k=17 and n=4
            ans = ans + num.get(k/fact); 
            
            num.remove(k/fact);
            
            if(num.size()==0)
            break;

            k=k%fact;             //
            fact=fact/num.size(); // this gives us new fact for next loop
        }
        return ans;
        
    }
}