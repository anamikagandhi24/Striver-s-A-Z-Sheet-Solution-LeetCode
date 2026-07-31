class Solution {
    public void solveSudoku(char[][] board) {
        helper(board);
    }
    public boolean helper(char [][]board){
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]=='.'){
                    for(char ch='1';ch<='9';ch++){
                        if(isValid(row,col,ch,board)){
                            board[row][col]=ch;
                            if(helper(board))
                                return true;
                            board[row][col]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(int row, int col, char ch, char[][]board){
        int startRow=(row/3)*3;
        int startCol=(col/3)*3;
        for(int i=0;i<9;i++){
            if(board[i][col]==ch)
                return false;
        }
        for(int j=0;j<9;j++){
            if(board[row][j]==ch)
                return false;
        }
        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++){
                if(board[i][j]==ch){
                    return false;
                }
            }
        }
        return true;
    }
}