package aastrings;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharsInStringWithHashMap {

    public static void main(String[] args) {
        String str = "TechMahindra";
        findOcurrence(str);

    }

    public static void findOcurrence(String str) {
        HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
        char[] charStr = str.toCharArray();
        for (char ch : charStr) {
            if (hs.containsKey(ch))
                hs.put(ch, hs.get(ch) + 1);
            else
                hs.put(ch, 1);
        }
        for (Map.Entry entry : hs.entrySet())
            System.out.println(entry.getKey() + "  " + entry.getValue());
    }
}
