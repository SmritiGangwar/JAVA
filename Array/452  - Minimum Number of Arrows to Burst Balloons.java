class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));  //Sorting acc to end points
        int count = 0, arrow=0;
        for(int i=0;i<points.length;i++){
            if( count==0 || points[i][0] > arrow){     //Comparing with starting point
                count++;
                arrow=points[i][1]; //End point, the whole segment will become arrow
            }
        }
        return count;
    }
}
