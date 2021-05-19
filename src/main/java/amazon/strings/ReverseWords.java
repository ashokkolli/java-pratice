package amazon.strings;

/**
 * Created by Ashok Kolli on 5/13/2021
 */

public class ReverseWords {

    public static void main(String[] args) {
        String str = "Reverse Words in a String";
        reverseWords(str);
    }

    public static void reverseWords(String str) {
        String[] strArr = str.split("\\s");
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length - 1; i >= 0; i--) {
            sb.append(strArr[i]);
            if (i > 0)
                sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
