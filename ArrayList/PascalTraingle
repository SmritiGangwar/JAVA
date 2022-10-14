import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Pascal(n);
    }
    public static List<List<Integer>> Pascal(int n){
       List<List<Integer>> triangle = new ArrayList<List<Integer>>();
       if(n==0){
           return triangle;
       }
       for(int i=0;i<n;i++){
           List<Integer> row = new ArrayList<>();
           for(int j=0;j<i+1;j++){
               if(j==0 || j==i){
                   row.add(1);
               }
               else{
                   row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
               }
           }
           triangle.add(row);
       }
       return triangle;
    }
}
