package amazon.strings;

/**
 * Created by Ashok Kolli on 5/19/2021
 */

public class StringRotation {

    public static void main(String[] args) {
        System.out.println(areStringsRotated("ABCD", "CDAB"));
    }

    public static boolean areStringsRotated(String strOne, String strTwo) {
        return strOne != null && strTwo != null && strOne.length() == strTwo.length() && (strOne + strOne).indexOf(strTwo) != -1;
    }
}
