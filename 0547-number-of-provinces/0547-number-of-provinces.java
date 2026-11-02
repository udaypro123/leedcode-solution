class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n= isConnected.length;

        int count=0;
        boolean[] visited = new boolean[n];

        for(int i=0; i<n; i++){
            if(!visited[i]){
                count++;
                Queue<Integer> q= new LinkedList<>();
                q.offer(i);

                while(!q.isEmpty()){
                    int city= q.poll();
                    for(int j=0; j<n; j++){
                        if(isConnected[city][j]==1 && !visited[j]){
                            visited[j]= true;
                            q.offer(j);
                        }
                    }
                }
            }
        }

        return count;
    }
}