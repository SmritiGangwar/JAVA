public class Letter_Tile {
    public static void main(String[] args) {
        String str = "AAB";
        int [] freq = new int[26];
        for(int i=0;i< str.length();i++){
            int idx = str.charAt(i)-'A';
            freq[idx]++;        //freq[idx] = freq[idx] + 1;
        }

        for(int i=0;i<freq.length;i++){
            System.out.print(freq[i]+" ");
        }
        System.out.println(Tile(freq,""));

    }

    public static int Tile(int [] freq,String ans){
        System.out.println(ans);
        int count=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>=1){
                char ch =(char) (i+'A');
                freq[i]--;
                count+= Tile(freq,ans + ch) +1;
                freq[i]++;
            }
        }
        return count;
    }
}
