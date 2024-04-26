#include <stack>
class Solution {
public:
    bool isValid(string s) {
        stack<char> x;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s[i]=='(' || s[i]=='['|| s[i]=='{'){
                x.push(s[i]);
            }
            else
            {
                if(x.empty())
                return false;
                else if(!is_matching(s[i],x.top()))
                return false;
                else
                x.pop();
            }
        }
        return x.empty();
    }
    bool is_matching(char c,char d){
        if((c==')' && d=='(') || (c=='}' && d=='{') || (c==']' && d=='['))
        return true;
        return false;
    }
};