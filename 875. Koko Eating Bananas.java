class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0,n=piles.length;
        
        for(int i=0;i<n;i++)
        if(piles[i]>max)
        max=piles[i];
            
        if(h==n)
        return max;

        int start=1,end=max,i=0,ans=max;
        long count=0;
      
        while(start<=end){
            i=(start+end)/2;
            count=0;
            count=func(piles,i,h);
            
            if(count>h)
                start=i+1;            
            else {
                ans=i;
                end=i-1;   
            }

        }

        return ans ;
    }
    int func(int[] piles,int i,int h){
        int count=0;
        for(int j=0;j<piles.length;j++){
                if(count>h){
                break;
                }
                if(piles[j]%i==0)
                {
                    count+=piles[j]/i;
                }
                else 
                count=count+(piles[j]/i)+1;
            }
            return count;
    }
}