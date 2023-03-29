//Using BFS, Ques also on GFG

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Number_of_Islands {
    class Pair{
        int first;
        int second;
        public Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of vertices and edges :");
        int v = sc.nextInt();
        int e = sc.nextInt();

        System.out.println("Enter Adjacency Matrix");
        int [][] adjMat = new int[v][e];
        for(int i=0;i<v;i++){
            for(int j=0;j<e;j++){
                adjMat[i][j]=sc.nextInt();
            }
        }
        //Graph Created

        int count=0;
        int [][] vis = new int[v][e];

        Number_of_Islands obj = new Number_of_Islands();
        for(int i=0;i<v;i++){
            for(int j=0;j<e;j++){
                if(vis[i][j]==0 && adjMat[i][j]==1){
                    count++;
                    obj.BFS(i,j,adjMat,vis);
                }
            }
        }
    }

    public  void BFS(int row, int col, int[][] adjMat, int[][] vis){
        vis[row][col]=1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        int n = adjMat[0].length;
        int m = adjMat.length;

        while(!q.isEmpty()){
            int r = q.peek().first;
            int c = q.peek().second;
            q.remove();

            for(int i=-1;i<=1;i++){
                for(int j=-1;j<=1;j++){
                    int nrow=r+i;
                    int ncol=c+j;
                    if(nrow >=0 && nrow< n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && adjMat[nrow][ncol]==1){
                        vis[nrow][nrow]=1;
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }
        }
    }
}
