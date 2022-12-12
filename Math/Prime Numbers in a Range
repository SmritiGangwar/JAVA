public class Prime_in_Range {
    public static void main(String[] args) {
        int n =40;
        boolean [] primes = new boolean[n+1];   //To include 40 as well
        sieve(n,primes);
    }

    //default value of boolean is false so every element initially is false
    //so if ele is false then take it as prime and make its multiples as true.
    //true mesns already visited
    public static void sieve(int n, boolean[] primes){
        for(int i=2; i*i <= n; i++){
            if(!primes[i]){
                for (int j=i*2; j<=n; j+=i){
                    primes[j] = true;
                }
            }
        }
        for(int i = 2;i<=n;i++){
            if(!primes[i])
                System.out.print(i +" ");
        }
    }
}
