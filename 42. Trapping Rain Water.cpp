class Solution {
public:
    int trap(vector<int>& height) {
        vector<int> left,right;

        int l=0,r=0;
        for(int i=0;i<height.size();i++){
            if(height[i]>l)
            l=height[i];
            left.push_back(l);

        }
       
        for(int i=height.size()-1;i>=0;i--){
            if(height[i]>r)
            r=height[i]; 
            right.push_back(r);   
        }
        reverse(right.begin(),right.end());
        
        int sum=0;
        for(int i=0;i<height.size();i++){
            sum=sum+(min(right[i],left[i])-height[i]);
        }
        return sum;
            
    }
};