//if it gives x^(y-1) then multiply by x
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println(Power(x,y));
    }

    public static int Power(int x,int y){
        if(y==0)
            return 1;
        return x*Power(x,y-1);

        //OR
        //int ans = pow(x,y);
        //return ans*x;

    }
}
