package aastrings.practice;

public class StringCompare {

    //Is Comparision is case sensitive or not
    public static boolean compareTwoStrings(String s1, String s2) {
        if (s1 == null | s2 == null) {
            System.out.println("null");
            return false;
        }

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;

    }

    public static boolean compareTwoStringsArrays(String s1, String s2) {
        if (s1 == null | s2 == null) {
            System.out.println("null");
            return false;
        }

        if (s1.length() != s2.length())
            return false;

        String str;
        char[] chArr1 = s1.toCharArray();
        char[] chArr2 = s2.toCharArray();

        for (int i = 0; i < s1.length(); i++) {

            if (chArr1[i] != chArr2[i]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        boolean b = compareTwoStrings(null, "String");
        b = compareTwoStringsArrays("", "String");
        System.out.println(b);

    }
}
