public class Reverse_Bits {
    public static void main(String[] args) {
        System.out.println(reverseBits(1010100011));
    }
    public static int reverseBits(int n) {
        if(n==0)
            return n;
        int ans = 0;
        for(int i=0; i<32 ;i++){
            ans<<=1;
            ans+=(n & 1);
            n=n>>1;
        }
        return ans;
    }
}
