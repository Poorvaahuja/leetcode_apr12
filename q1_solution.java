// DFS
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        for(int i=0; i<n; i++){
            if(!vis[i]){
                count++;
                dfs(i, isConnected, vis);
            }
        }
        return count;
    }
    public void dfs(int node, int[][] isConnected, boolean[] vis){
        vis[node] = true;
        for(int i=0; i<isConnected.length; i++){
            if(isConnected[node][i] == 1 && !vis[i]){
                dfs(i, isConnected, vis);
            }
        }
    }
}
