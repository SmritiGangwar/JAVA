class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat[0].length, sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];     //Primary Elements
            sum+=mat[i][n-i-1]; //Secondary Elements
        }
        return n%2==0 ? sum : sum-mat[n/2][n/2];
    }
}
