public class Square_Root {
    public static void main(String[] args) {
        int num =40;
        int p = 3;      //Precision
        System.out.println(intValue(num,p));
        System.out.printf("%.3f",intValue(num,p));
    }
    public static double intValue(int m,int p){

        int high=m;
        int low=0;
        double root = 0.0;

        while(low<=high){
            int  mid=low+(high-low)/2;
            if(m==mid*mid){
                return mid;
            }
            else if (m>mid*mid){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        double incr = 0.1;
        for(int i =0; i< p; i++){
            while(root*root <= m){
                root += incr;
            }

            root -= incr;
            incr /=10;
        }
        return root;
    }
}
