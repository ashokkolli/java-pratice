package core.practiceStrings;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {
    public static void main(String[] args) {
        String[] arr = {"geeks", "for", "geeks", "a",
                "data", "data", "data", "can",
                "be", "data", "science",
                "zoom", "yup", "fire", "in",
                "be", "data", "geeks"};
        mostFrequentWord(arr);
    }

    public static String mostFrequentWord(String[] words) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        int max = Integer.MIN_VALUE;
        String fw = "";
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                fw = entry.getKey();
            }
        }
        System.out.println(max + " " + fw);
        return "";
    }
}
