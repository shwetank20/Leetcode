class Solution {
    // reucrive code
     public void func(int col,int n,char[][] board,List<List<String>> ans){
        if(col==n){
            ans.add(construct(board));
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                func(col+1,n,board,ans);
                board[row][col]='.';
            }
        }

    }
    // main func initiation
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        func(0,n,board,ans);
        return ans;
    }
    //
    public boolean isSafe(int row,int col,char[][] board){
        int dupcol=col,duprow=row;
        while(col>=0 && row>=0){
            if(board[row][col]=='Q') 
            return false;
            
            row--;
            col--;
        }
        row=duprow;
        col=dupcol;
        while(col>=0 ){
            if(board[row][col]=='Q') 
            return false;

            col--;
        }
        row=duprow;
        col=dupcol;
        while(col>=0 && row<board.length){
            if(board[row][col]=='Q') 
            return false;
            
            row++;
            col--;
        }
        // if all above no false then true
        return true;

    }
    // construct method to make 2d char array to list<String>
    static List < String > construct(char[][] board) {
        List<String> ds = new LinkedList<String>();
        for (int i=0; i<board.length; i++) {
            String s = new String(board[i]);
            ds.add(s);
        }
        return ds;
    }
   
    
}