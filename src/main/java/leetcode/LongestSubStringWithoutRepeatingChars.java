package leetcode;

import java.util.HashMap;

/**
 * Created by Ashok Kolli on 7/23/2020
 */

public class LongestSubStringWithoutRepeatingChars {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 0;
        //keep a hashmap which stores the characters in string as keys and their positions as values
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int start = 0;//Start Index of non repetitve chars
        int end = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                //if found in hashmap that value,then increment start i.e pointer to the right of the same character last found.
                start = Math.max(start, map.get(s.charAt(i)) + 1);
            }
//else put in map and get end pointer update with the current longest string
            map.put(s.charAt(i), i);
            end = Math.max(end, i - start + 1);
        }
        return end;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));


    }
}
