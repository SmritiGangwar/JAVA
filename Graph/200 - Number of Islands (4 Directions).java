class Solution {
    class Pair{
        int first;
        int second;
        public Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public int numIslands(char[][] adjMat) {
        int v = adjMat.length;
        int e = adjMat[0].length;
        int count=0;
        int [][] vis = new int[v][e];

        for(int i=0;i<v;i++){
            for(int j=0;j<e;j++){
                if(vis[i][j]==0 && adjMat[i][j]=='1'){
                    count++;
                    BFS(i,j,adjMat,vis);
                }
            }
        }
        return count;
        
    }

    public void BFS(int row, int col, char[][] adjMat, int[][] vis){
        vis[row][col]=1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        int n = adjMat.length;
        int m = adjMat[0].length;

        while(!q.isEmpty()){
            int r = q.peek().first;
            int c = q.peek().second;
            q.remove();

            for(int i=-1;i<=1;i++){
                for(int j=-1;j<=1;j++){
                   if(i==0 || j==0){  //Condition for Horizontal And Vertical indices only
                        int nrow=r+i;
                        int ncol=c+j;
                    if(nrow >=0 && nrow< n && ncol>=0 && ncol<m  && adjMat[nrow][ncol]=='1' && vis[nrow][ncol]==0){
                        vis[nrow][ncol]=1;
                        q.add(new Pair(nrow,ncol));
                    }
                   }
                }
            }
        }
    }
}
