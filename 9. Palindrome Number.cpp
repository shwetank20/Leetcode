class Solution {
public:
    bool isPalindrome(int x) {
        long z=x,y=0;
        while(x){
            y=y+x%10;
            y*=10;
            x/=10;
        }
        y/=10;
        if(z==y and z>=0){
           //  printf("%d %d",y,z);
        return true;
        }
        else{
       //  printf("%d %d",y,z);
        return false;
        }
    }
};