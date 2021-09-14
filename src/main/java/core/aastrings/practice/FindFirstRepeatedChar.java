package core.aastrings.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstRepeatedChar {

    public static char findFirstRepeatedChar(String str) {
        str = str.replaceAll(" ", "");
        Map<Character, Integer> hm = new LinkedHashMap<>();
     /*   if(str == null)
            return null;
        if(str.length() < 2);
            return null;*/
        char ch = 0;
        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(str.charAt(i))) {
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);

            } else
                hm.put(str.charAt(i), 1);
        }
        for (char cha : str.toCharArray()) {
            if (hm.get(cha) > 1)
                ch = cha;
            break;
        }
        System.out.println(ch);
        return ch;

    }

    public static void main(String[] args) {
        String str = "mamaamzonllllex";
        findFirstRepeatedChar(str);
    }

}
