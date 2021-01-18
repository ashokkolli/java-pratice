package practiceStrings;

public class StringReverse1 {
    public static void main(String[] args) {
        char[] charArr = stringReverse("String");
        for (char ch : charArr) {
            System.out.print(ch);
        }
        System.out.println();
        String str = stringReverseWithStringBuilder("String");
        System.out.println(str);
    }

    public static char[] stringReverse(String str) {
        char[] charArr = str.toCharArray();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            char tempChar = charArr[j];
            charArr[j] = charArr[i];
            charArr[i] = tempChar;
            i++;
            j--;
        }
        return charArr;
    }

    public static String stringReverseWithStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        str = sb.reverse().toString();
        return str;
    }
}