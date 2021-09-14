package core.others.practice;

/**
 * Created by Ashok Kolli on 6/9/2020
 */

public class StringReg {
    public static void main(String[] args) {
        String str = "[35,361][60,393]";
        str = str.replace("[", ",")
                .replace("]", "");
        String[] coords = null;
        System.out.println(str);
        coords = str.split(",");
        System.out.println(str);
        for (String str1 : coords)
            System.out.println(str1);
    }
}
