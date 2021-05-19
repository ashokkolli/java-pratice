package amazon.strings;

/**
 * Created by Ashok Kolli on 5/13/2021
 */

public class ReverseString {

    public static void main(String[] args) {
        reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }

    public static void reverseString(char[] s) {

        int len = s.length;
        if (s == null || len == 0)
            System.out.println("String shouldn't be null");


        char ch = ' ';
        int i = 0, j = len - 1;
        while (i < j) {
            System.out.println(s[i] + " " + s[j]);
            if (s[i] != s[j]) {
                ch = s[i];
                s[i] = s[j];
                s[j] = ch;
            }
            i++;
            j--;

        }
        for (int k = 0; k < len; k++) {
            System.out.print(s[k]);
        }

    }

}
