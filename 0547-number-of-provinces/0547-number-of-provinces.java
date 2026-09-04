class Solution {
    public int findCircleNum(int[][] isConnected) {
        int V=isConnected.length;
        boolean[]visited=new boolean[V];
        int count=0;
        for(int i=0;i<V;i++){
            if(!visited[i]){
                count++;
                dfs(i,isConnected,visited,V);
            }
        }
        return count;
    }
    private void dfs(int node, int[][] isConnected, boolean []visited,int V){
        visited[node]=true;
        for(int j=0;j<V;j++){
            if (isConnected[node][j]==1){
                if(!visited[j]){
                    dfs(j,isConnected,visited,V);
                }
            }
        }
    }
}