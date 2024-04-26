class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length,max=weights[0],sum=0;
        for(int i=0;i<n;i++){
            max=max>weights[i]?max:weights[i];
            sum+=weights[i];
        }
        int start=max,end=sum,i=0,ans=weights[0];
        while(start<=end){
            i=(start+end)/2;
        //for(int i=max;i<=sum;){
            int x=func(weights, days,i);
            if(x==-1){
                start=i+1;
            }
            else if(x==0){
                ans=i;
                end=i-1;

            }

        } 
        return ans;
    }
    public int func(int[] weights,int days, int cap){
        int n=weights.length,sum=0;
        for(int i=0;i<n;i++){
            //System.out.println(sum+" "+ weights[i]+" "+cap);
            
            sum+=weights[i];
            
            if(sum>cap){
                days--;
                sum=weights[i];
            }
            if(days==0){
                return -1;
            }
            
        }
        return 0;
    }
}