package core.tiktok.strings.slidingwindow;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;


//https://leetcode.com/problems/find-all-anagrams-in-a-string/

public class _438_AllAnagramsInString {

    public static void main(String[] args) {
        String s = "abab", p = "ab";
        System.out.println(findAnagrams(s, p));
    }

    public static List<Integer> findAnagrams_pr(String s, String p){
        Map<Character, Integer> pCount = new HashMap<>();
        Map<Character, Integer> sCount = new HashMap<>();

        for(char c : p.toCharArray()){
            pCount.put(c, pCount.getOrDefault(c, 0) + 1);
        }
        List<Integer> outputList = new ArrayList<>();
        int i = 0;
        for(int j = 0; j < s.length(); j++){
            char ch  = s.charAt(j);
            sCount.put(ch, sCount.getOrDefault(ch, 0)+1);

        }

        return null;
    }


    public static List<Integer> findAnagrams(String s, String p) {
        int ns = s.length(), np = p.length();
        if (ns < np)
            return new ArrayList<>();
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

        //Input: s = "cbaebabacd", p = "abc"
        List<Integer> output = new ArrayList<>();
        //Sliding window on the String S
        int i = 0;
        for (int j = 0; j < ns; j++) {
            //Add one more letter on the right side of the windows
            char ch = s.charAt(j);
            if (sCount.containsKey(ch)) {
                sCount.put(ch, sCount.get(ch) + 1);
            } else {
                sCount.put(ch, 1);
            }

            //when window size is grater than length of p
            // then remove one letter from the left side of the window
            //then move forward with i
            if (j >= np) {
                ch = s.charAt(i);
                if (sCount.get(ch) == 1) {
                    sCount.remove(ch);
                } else {
                    sCount.put(ch, sCount.get(ch) - 1);
                }
                //Move forward
                i++;
            }
            if (pCount.equals(sCount)) {
                output.add(i);
            }

        }
        return output;

    }
}
