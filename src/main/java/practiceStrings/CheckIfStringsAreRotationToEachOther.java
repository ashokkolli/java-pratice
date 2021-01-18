package practiceStrings;

public class CheckIfStringsAreRotationToEachOther {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";
        boolean isRoated = isRotated(str1, str2);
    }

    public static boolean isRotated(String str1, String str2) {
        String temp = str1 + str1;
        System.out.println(temp);
        return temp.indexOf(str2) != -1;
    }
}
