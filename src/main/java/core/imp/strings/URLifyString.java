package core.imp.strings;

/**
 * Created by Ashok Kolli on 5/15/2021
 */

public class URLifyString {

    public static void main(String[] args) {
        urlfyStringM1("This is  Ashok");

        urlfyStringM2("This is  ashok");
    }

    public static String urlfyStringM1(String str) {
        //trim
        str = str.trim().replaceAll("\\s", "%20");

        System.out.println(str);

        return str;

    }

    public static String urlfyStringM2(String str) {
        str = str.trim();
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                stb.append("%20");
            } else
                stb.append(str.charAt(i));
        }

        System.out.println(stb.toString());
        return stb.toString();
    }

}
