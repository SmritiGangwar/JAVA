
public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(Prime(59));
    }
    public static boolean Prime(int n){
        int div =2;
        while(div*div <=n){
            if(n%div ==0){
                return false;
            }
            div++;
        }
        return true;
    }
}
