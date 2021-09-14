package core.practiceStrings;

import java.util.Arrays;

public class AnagramOfEachOther {
    public static void main(String[] args) {
        boolean isAnagram = isAanagramOfEachOther("ashok", "kolli");
        System.out.println(isAnagram);
    }

    public static boolean isAanagramOfEachOther(String str1, String str2) {

        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        Arrays.sort(charArr1);
        String sortStr1 = String.valueOf(charArr1);
        Arrays.sort(charArr2);
        String sortStr2 = String.valueOf(charArr2);
        System.out.println(sortStr1);
        System.out.println(sortStr2);
        return sortStr1.equalsIgnoreCase(sortStr2);

    }
}
