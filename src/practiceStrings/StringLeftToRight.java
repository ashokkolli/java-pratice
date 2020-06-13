package practiceStrings;

import java.util.Arrays;

public class StringLeftToRight {
    public static void main(String[] args) {
        String str = "abcde";
        char[] charArr = str.toCharArray();
        int offset = 3;
        int len = str.length();
        // offset %= len;
        reverse(charArr, 0, offset - 1);
        reverse(charArr, offset, len - 1);
        reverse(charArr, 0, len - 1);
        System.out.println(Arrays.toString(charArr));
    }

    public static void reverse(char[] charArr, int start, int end) {
        char temp;
        while (start < end) {
            temp = charArr[end];
            charArr[end] = charArr[start];
            charArr[start] = temp;
            start++;
            end--;
        }

    }
}
