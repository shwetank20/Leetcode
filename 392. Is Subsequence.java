class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length(),m=t.length();
        if(m==0&&n==0) return true;
        if(m==0 )
        return false;
        if(n==0) return true;
        if(n>m){
            
            return false;
        }
        else if(m>=n){
            int j=0;
            for(int i=0;i<m&&j<n;i++){
                if(s.charAt(j)==t.charAt(i))
                j++;

            }
            if(j==n)
            return true;
            return false;
        }
       
    return false;
    }
}