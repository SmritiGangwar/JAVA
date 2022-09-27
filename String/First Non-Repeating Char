import java.util.Scanner;
public class FirstNonRepeating{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String str = sc.next();
            int ans=Check(str);
            if(ans!=-1)
            {
                System.out.println(str.charAt(ans));
            }
            else{
                System.out.println(ans);
            }
    }

    public static int Check(String str) {

        int n=str.length();
        int [] freq= new int[26];
        for(int i=0;i<n;i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            int index=str.charAt(i)-'a';
            if(freq[index]==1)
            {
                return i;
            }
        }
        return -1;

    }
}




