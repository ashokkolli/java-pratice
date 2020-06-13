package aastrings.practice;

public class LeftAndRightRotate {
    public static String leftRotate(String str, int d) {
        str = str.substring(d) + str.substring(0, d);
        System.out.println(str);
        return str;

    }

    public static String rightRotate(String str, int d) {

        str = str.substring(str.length() - d) + str.substring(0, str.length() - d);
        System.out.println(str);


        return str;
    }


    public static void main(String[] args) {
        leftRotate("abcdefghij", 2);
        rightRotate("abcdefghij", 2);

        //GeeksforGeeks
        //LeftRotate: eksforGeeksGe
        //RightRotate: ksGeeksforGeeks

        //abcdefghij
        //LeftRotate: cdefghijab
        //RightRotate: ijabcdefgh
    }
}
