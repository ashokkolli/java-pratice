package core.aastrings.practice;

import java.util.HashMap;
import java.util.Map;

public class MostFreequentWord {

    public static String mostFrequentWord(String[] strArr) {
        int max = 1;
        String output = "";
        Map<String, Integer> map = new HashMap<>();
        for (String str : strArr) {
            if (!map.containsKey(str))
                map.put(str, 1);
            else {
                map.put(str, map.get(str) + 1);
            }
            if (map.get(str) > max) {
                output = str;
                max = map.get(str);
                System.out.println(output + " " + max);
            }

        }
        System.out.println("most : " + output);
        return output;
    }

    public static void main(String[] args) {

        String[] arr = {"abc", "abc", "geeks", "geeks", "geeks", "xyz", "xyz", "xyz", "xyz"};
        mostFrequentWord(arr);

    }
}
