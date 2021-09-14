package core.practiceStrings;

import java.util.ArrayList;
import java.util.List;

public class AllRotationsOfString {

    // Driver method
    public static void main(String[] args) {
        String str = "geeks";
        List<String> list = allRotationsOfString(str);
        for (String str1 : list)
            System.out.println(str1);
    }

    public static List<String> allRotationsOfString(String str) {
        List<String> list = new ArrayList<>();
        int len = str.length();
        StringBuilder sb = new StringBuilder(str);
        sb.append(str);
        for (int i = 0; i < len; i++) {
            list.add(sb.substring(i, i + len));
        }
        return list;
    }
}


