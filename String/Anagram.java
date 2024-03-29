
//Count of all letters in str1 should be equal to count of every char in str2.
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String t = sc.next();
        System.out.println(Anag(str,t));

    }

    public static boolean Anag(String str, String t){
        int n=str.length();
        int m=t.length();
        int [] freq1= new int[26];
        for(int i=0;i<n;i++){
            freq1[str.charAt(i)-'a']++;
        }
        int [] freq2= new int[26];
        for(int i=0;i<m;i++){
            freq2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++) {
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}
//a,b,c,d
//[3,0,0,0]
//[2,0,0,0]
