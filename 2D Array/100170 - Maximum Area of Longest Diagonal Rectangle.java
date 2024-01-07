class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = Double.MIN_VALUE;
        int area = 1;
        for(int i=0;i<dimensions.length;i++){
            int l = dimensions[i][0];
            int b = dimensions[i][1];
            double sqrt = Math.sqrt(l*l + b*b);
            if((sqrt > max) || (sqrt==max && l*b>area)){
                max = sqrt;
                area = l*b;
            }
        }
        return area;
    }
}
