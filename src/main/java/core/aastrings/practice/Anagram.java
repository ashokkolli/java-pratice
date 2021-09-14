package core.aastrings.practice;

public class Anagram {

    public static boolean isAnagram(String strA, String strB) {
        if (strA == null || strB == null)
            return false;
        if (strA.length() != strB.length())
            return false;

        for (int i = 0; i < strA.length(); i++) {
            if (!strB.contains(strA.charAt(i) + "")) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String strA = "abc";
        String strB = "bac";
        System.out.println(isAnagram(strA, strB));


    }
}
