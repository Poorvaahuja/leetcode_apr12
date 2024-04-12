// BFS
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        for(int i=0; i<n; i++){
            if(!vis[i]){
                count++;
                bfs(i, isConnected, vis);
            }
        }
        return count;
    }
    public void bfs(int node, int[][] isConnected, boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        vis[node] = true;
        while(!q.isEmpty()){
            node = q.poll();
            for(int i=0; i<isConnected.length; i++){
                if(isConnected[node][i] == 1 && !vis[i]){
                    q.offer(i);
                    vis[i] = true;
                }
            }
        }
    }
}
