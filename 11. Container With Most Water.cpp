class Solution {
public:
    int maxArea(vector<int>& height) {
        int area=0;
        long b=0,e=height.size()-1;
        for(long i=0;i<height.size();i++){
            long lh=height[b];
            long rh=height[e];
            long minh=min(lh,rh);
            int c_area=minh*(e-b);
            area=max(c_area,area);
            if(lh<rh)b++;
            else e--;  

        }
        return area;

    }
};