package core.apple.strings;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Ashok Kolli on 5/15/2021
 */

public class StringCompression {
    // Objective: Write an algorithm to compress the given string by using the count of repeated characters
    // and if new compressed string length is not smaller than the original string then return the original string.

    public static void main(String[] args) {
        String str = compressedString("aaabc");
        System.out.println(str);
    }

    public static String compressedString(String str) {
        int strLength = str.length();
        Map<Character, Integer> map = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strLength; i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else
                map.put(str.charAt(i), 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey()).append(entry.getValue());
        }
        if (sb.toString().length() < str.length())
            return sb.toString();
        return str;
    }


}
