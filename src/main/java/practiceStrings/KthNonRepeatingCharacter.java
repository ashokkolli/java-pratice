package practiceStrings;

import java.util.LinkedHashMap;
import java.util.Map;

public class KthNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "asshok";
        int k = 3;
        nonRepeatingChar(str, k);
    }

    public static void nonRepeatingChar(String str, int k) {
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
        int count = 0;
        int ch = '0';
        for (int i = 0; i < str.length(); i++) {
            if (lhm.containsKey(str.charAt(i))) {
                lhm.put(str.charAt(i), lhm.get(str.charAt(i)) + 1);
            } else {
                lhm.put(str.charAt(i), 1);
            }

        }
        for (Map.Entry<Character, Integer> map : lhm.entrySet()) {
            if (map.getValue() == 1) {
                count++;
                map.getKey();
            }
            if (count == k) {
                System.out.println(map.getKey());
                break;

            }
        }
    }
}
