package core.aastrings.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AllAnagramsTogether {
    public static String[] allAnagrams(String[] words) {
        char[] chArr = null;
        HashMap<String, List<String>> hm = new HashMap<>();
        if (words == null)
            return null;
        if (words.length < 3)
            return words;
        for (int i = 0; i < words.length; i++) {
            chArr = words[i].toCharArray();
            Arrays.sort(chArr);
            String sortedWord = new String(chArr);
            if (!hm.containsKey(sortedWord)) {
                List<String> list = new ArrayList<>();
                list.add(words[i]);
                hm.put(words[i], list);
            } else {
                hm.get(sortedWord).add(words[i]);
                System.out.println(hm.get(sortedWord));
            }
        }

        return words;
    }

    public static void main(String[] args) {
        String[] words = {"cat", "dog", "tac", "god", "act"};
        allAnagrams(words);

    }


}
