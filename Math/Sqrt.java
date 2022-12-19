public class Sqrt_Newton_Raphson {
    public static void main(String[] args) {
        double n = 40;
        System.out.println(Root(n));
    }
    public static double Root(double n){
        double root;
        double x = n;
        while(true) {
            root = 0.5 * (x + (n / x));

            if (Math.abs(root - x) < 0.5) {       //(Math.abs(root - x) < 1)   jitna less precision value utna close ans
                break;
            }
            x=root;
        }
        return root;
    }

}
