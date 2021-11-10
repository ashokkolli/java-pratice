package core.imp.strings.slidingwindow;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class AllAnagramsInString {

    public static void main(String[] args) {
        String s = "abab", p = "ab";
        System.out.println(findAnagrams(s, p));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        int ns = s.length(), np = p.length();
        if (ns < np)
            return new ArrayList<>();
        int i = 0;
        Map<Character, Integer> pCount = new HashMap<>();
        Map<Character, Integer> sCount = new HashMap<>();

        //build reference hashmap using String p
        for (char ch : p.toCharArray()) {
            if (pCount.containsKey(ch)) {
                pCount.put(ch, pCount.get(ch) + 1);
            } else {
                pCount.put(ch, 1);
            }
        }

        List<Integer> output = new ArrayList<>();
        //Sliding window on the String S

        for (int j = 0; j < ns; j++) {
            //Add one more letter on the right side of the windows
            char ch = s.charAt(j);
            if (sCount.containsKey(ch)) {
                sCount.put(ch, sCount.get(ch) + 1);
            } else {
                sCount.put(ch, 1);
            }

            //remove one letter from the left side of the window
            if (j >= np) {
                ch = s.charAt(i);
                if (sCount.get(ch) == 1) {
                    sCount.remove(ch);
                } else {
                    sCount.put(ch, sCount.get(ch) - 1);
                }
                i++;
            }
            if (pCount.equals(sCount)) {
                output.add(i);
            }

        }
        return output;

    }
}
