//Remove adjacent duplicate letters

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "aabccba";           //O/P: abcba
        str = str + " ";
        String str1 = "";

        Duplicate(str, str1);
    }

    public static void Duplicate(String str, String str1) {
        int n = str.length();
        int i = 0, j = 1;

        while (i < n && j < n) {

            if (str.charAt(i) == str.charAt(j)) {
                j++;
            } else if ((str.charAt(i) != str.charAt(j))) {
                str1 = str1 + str.charAt(i);
                i = j;
                j = i + 1;
            }

            System.out.println(str1);
        }
    }
}
