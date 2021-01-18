package aastrings.practice;

public class ReverseString {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(i);
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {

        reverseString("abc");
    }
}
