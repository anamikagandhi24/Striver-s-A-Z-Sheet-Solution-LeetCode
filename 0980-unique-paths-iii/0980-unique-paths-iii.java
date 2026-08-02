class Solution {
    public int uniquePathsIII(int[][] grid) {
        int rem=0;
        int startRow=0,startCol=0;
        boolean [][]visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=-1)
                    rem++;
                if(grid[i][j]==1){
                    startRow=i;
                    startCol=j;
                }
            }
        }
        return helper(startRow,startCol,grid,rem,visited);
    }
    public int helper(int startRow, int startCol,int[][]grid,int rem,boolean [][]visited){
        if(startRow<0 ||startCol<0 ||startRow>=grid.length ||startCol>=grid[0].length){
            return 0;
        }
        if(grid[startRow][startCol]==-1)
            return 0;
        if(visited[startRow][startCol])
            return 0;
        if(grid[startRow][startCol]==2){
            if(rem==1){
                return 1;
            }else{
                return 0;
            }
        }
        
        visited[startRow][startCol]=true;
        
        int paths=helper(startRow+1,startCol,grid,rem-1,visited)+helper(startRow,startCol+1,grid,rem-1,visited)+helper(startRow-1,startCol,grid,rem-1,visited)+helper(startRow,startCol-1,grid,rem-1,visited);

        visited[startRow][startCol]=false;
        return paths;

    }
}