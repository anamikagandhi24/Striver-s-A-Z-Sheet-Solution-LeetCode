class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        boolean[] col = new boolean[n];
        boolean[] diag1 = new boolean[2 * n - 1];
        boolean[] diag2 = new boolean[2 * n - 1];
        helper(0,board,col,diag1,diag2,n,ans);
        return ans;
    }
    public void helper(int row,char[][]board,boolean[]col,boolean[]diag1,boolean[]diag2,int n,List<List<String>>ans){
        if(row==n){
            List<String> temp = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }

            ans.add(temp);
            return ;
        }
        for(int c=0;c<n;c++){
            if(col[c]==false && diag1[row - c + (n - 1)]==false && diag2[row+c]==false){
                board[row][c]='Q';
                col[c]=true;
                diag1[row - c + (n - 1)]=true;
                diag2[row+c]=true;
                helper(row+1,board,col,diag1,diag2,n,ans);
                board[row][c]='.';
                col[c]=false;
                diag1[row - c + (n - 1)]=false;
                diag2[row+c]=false;
            }
        }
    }
}