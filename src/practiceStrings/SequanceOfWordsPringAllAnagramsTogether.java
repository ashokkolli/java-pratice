package practiceStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SequanceOfWordsPringAllAnagramsTogether {
    public static void main(String[] args) {
        String[] wordArr = {"cat", "dog", "tac", "god", "act"};
        sequanceOfWordsPringAllAnagramsTogether(wordArr);
    }

    public static void sequanceOfWordsPringAllAnagramsTogether(String[] wordsArr) {
        HashMap<Integer, List<String>> map = new HashMap<>();

        // loop over all words
        for (int i = 0; i < wordsArr.length; i++) {

            // convert to char array, sort and
            // then re-convert to string
            String word = wordsArr[i];
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);

            // calculate hashcode of string
            // after sorting
            int n = newWord.hashCode();
            if (map.containsKey(n)) {

                // Here, we already have
                // a word for the hashcode
                List<String> words = map.get(n);
                words.add(word);
                map.put(n, words);
            } else {

                // This is the first time we are
                // adding a word for a specific
                // hashcode
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(n, words);
            }
        }

        // print all the values where size is > 1
        // If you want to print non-anagrams,
        // just print the values having size = 1
        for (Integer i : map.keySet()) {
            List<String> values = map.get(i);
            if (values.size() > 1) {
                System.out.print(values);
            }
        }


    }


}




