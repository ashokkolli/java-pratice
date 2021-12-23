package core.tiktok.strings;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Ashok Kolli on 5/15/2021
 */

public class MostFrequentWord {

    public static void main(String[] args) {
        String[] arr = {"geeks", "for", "a", "a",
                "portal", "to", "learn", "can", "be",
                "computer", "science", "zoom", "yup",
                "fire", "in", "be", "data", "for"};
        getMostFrequentWord(arr);
    }


    public static String getMostFrequentWord(String[] strArr) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            map.put(strArr[i], map.getOrDefault(strArr[i], 0) + 1);
        }
        int count = 1;
        String mostFrequentWord = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            if (entry.getValue() > count) {
                count = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }
        System.out.println(mostFrequentWord);
        return mostFrequentWord;
    }
}
