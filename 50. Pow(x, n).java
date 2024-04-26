class Solution {
    // recursive Binary exponentiation
    public double myPow(double x, long n ) {
        if(n == 0)
            return 1;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        double res=myPow(x,n/2);
        if(n%2==1)
        return x*res*res;
        return res*res;
        
    }
}

//sol 2

class Solution {
    public double myPow(double x, int n) {
        long nn=n;
        double ans=1.0;
        if(nn<0)nn=-1*nn;
        while(nn>0){
            if(nn%2==1){
                ans=ans*x;
                nn=nn-1;
            }
            else{
                x=x*x;
                nn/=2;

            }

        }
        if(n<0) ans=1.0/ans;
        return ans;
        
    }
}