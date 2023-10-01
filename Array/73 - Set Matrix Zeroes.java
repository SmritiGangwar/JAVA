class Solution {
    public void setZeroes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        //To mark if the first row or col contains zero
        boolean frow=false, fcol=false;

        //Mark first row/col with zeroes if there are any zeroes in that row or in that col.
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    if(i==0)
                        frow=true; //The first row need to be changed to all zeroes later
                    if(j==0)
                        fcol=true; //The first col need to be changed to all zeroes later

                    mat[i][0]=0;    //First col elements
                    mat[0][j]=0;    //First row elements
                }
            }
        }

        //Change matrix elemts except first row-col
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(mat[i][0] == 0 || mat[0][j] == 0) {
                     mat[i][j] = 0;
                }
            }
        }

        //If first row contains zero--> change all elemts to zero
        if(frow){
            for(int j=0;j<m;j++){
                mat[0][j]=0;
            }
        }

        //If first col contains zero--> change all elemts to zero
        if(fcol){
            for(int i=0;i<n;i++){
                mat[i][0]=0;
            }
        }
      
    }
}
