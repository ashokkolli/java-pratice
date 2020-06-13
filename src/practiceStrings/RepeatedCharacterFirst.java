package practiceStrings;

import java.util.LinkedHashMap;

public class RepeatedCharacterFirst {

    public static void main(String[] args) {
        String str = "techmtechm";
        char ch = repeatedCharacterFirst(str);
    }

    public static char repeatedCharacterFirst(String str) {
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap();
        char ch = 'A';
        for (int i = 0; i < str.length(); i++) {
            if (lhm.containsKey(str.charAt(i))) {
                ch = str.charAt(i);
                lhm.put(str.charAt(i), lhm.get(str.charAt(i)) + 1);
                System.out.println(str.charAt(i));
                break;
            } else
                lhm.put(str.charAt(i), 1);
        }
        return ch;
    }

}

