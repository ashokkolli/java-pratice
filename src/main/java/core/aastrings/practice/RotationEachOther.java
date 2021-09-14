package core.aastrings.practice;


public class RotationEachOther {

    public static boolean areRotations(String strA, String strB) {
        String temp = strA + strA;
        return temp.contains(strB);

    }


    public static void main(String[] args) {
        System.out.println(areRotations("abc", "cab"));

    }

//abc
    // bca, cab,
    //

}
