class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0)
        return false;
       while(n!=1){
           if(n%2==0)
           n=n/2;
           else
           return false;
       } 
       return true;
    }
}


//sol 2

class Solution {
    public boolean isPowerOfTwo(int n) {
        int x=1,cnt=0;
        if(n==0)return false;
        while(n>1 && (n&1)==0){
            n>>=1;
            
        }
        
        return n==1;
    }
}