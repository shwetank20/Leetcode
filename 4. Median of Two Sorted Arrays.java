class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
    int n1=a.length,n2=b.length;
    int n=n1+n2;
    int i=0,j=0;
    int ind1=n/2-1,ind2=n/2;
    int el1=-1,el2=-2;
    int cnt=0;
    while(i<n1 && j<n2){
        if(a[i]<b[j]){
            if(cnt==ind1) el1=a[i];
            if(cnt==ind2) el2=a[i];
            cnt++;
            i++;
        }
        else {
            if(cnt==ind1) el1=b[j];
            if(cnt==ind2) el2=b[j];
            cnt++;
            j++;
        
        }
    }
    while(i<n1){
        if(cnt==ind1) el1=a[i];
        if(cnt==ind2) el2=a[i];
        cnt++;
        i++;
        
    }
    while(j<n2){
        if(cnt==ind1) el1=b[j];
        if(cnt==ind2) el2=b[j];
        cnt++;
        j++;
    }
    if(n%2==0)
    return (el1+el2)/2.0;
    else 
    return el2;
    }
}