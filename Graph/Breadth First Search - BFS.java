https://www.codingninjas.com/codestudio/problems/bfs-in-graph_973002?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<Integer> BFS(int v, int edges[][]){
		// WRITE YOUR CODE HERE
		//int v = edges[0].length;	//Vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v));
 
        // Create a new list for each
        // vertex such that adjacent
        // nodes can be stored
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }
         
        int i, j;
        for (i = 0; i < edges[0].length; i++) {
            for (j = 0; j < edges.length; j++) {
                if (edges[i][j] != 0) {
                    adj.get(i).add(j);
                }
            }
        }

		ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean [] visited = new boolean[v];
        q.add(0);     //Or 0-based then add 0
        visited[0]=true;

        while(!q.isEmpty()){
            int node = q.poll();
            res.add(node);

            //Get neighbours in queue
            for(int nbrs : adj.get(node)){
                if(!visited[nbrs]){
                    visited[nbrs]=true;
                    q.add(nbrs);
                }
            }
        }
		return res;

	}
}

