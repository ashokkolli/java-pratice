package core.tiktok.strings.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ashok Kolli on 7/26/2020
 */

//https://www.youtube.com/watch?v=jSto0O4AJbM


public class MinimumWindowSubString {

    public static String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0)
            return "";

        //Dictionary which keeps a count of all the unique characters in t
        Map<Character, Integer> dictT = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            dictT.put(t.charAt(i), dictT.getOrDefault(t.charAt(i), 0) + 1);
        }
        //Number of unique characters in t, which need to be present in the desired window
        int required = dictT.size();

        //Left and right pointers
        int l = 0, r = 0;

        // formed is used to keep track of how many unique characters are present in the current window in it's desired
        // frequency.
        int formed = 0;

        //Dictionary which keeps count of all the unique characters in the current window
        Map<Character, Integer> windowCount = new HashMap<>();

        //Ans list of the form(window length, left, right)
        int[] ans = {-1, 0, 0};

        while (r < s.length()) {
            //add one character from the right to window
            windowCount.put(s.charAt(r), windowCount.getOrDefault(s.charAt(r), 0) + 1);
            //If the frequency of the current character added equals to the desired count in t then increment
            // the formed count by 1
            if (dictT.containsKey(s.charAt(r)) && windowCount.get(s.charAt(s.charAt(r))).intValue() == dictT.get(s.charAt(s.charAt(r))).intValue())
                formed++;


            //try and contract the window till the point where it ceases to be desirable
            while (l <= r && formed == required) {
                char c = s.charAt(l);
                //Save the smallest window until now
                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }
                //The character at the position pointed by the
                //'Left' pointer is no longer a part of the window

                windowCount.put(c, windowCount.get(c) - 1);
                if (dictT.containsKey(c) && windowCount.get(c).intValue() < dictT.get(c).intValue())
                    formed--;

                //Move left pointer ahead, this would help to look for a new window
                l++;

            }
            // Keep expanding the window once we are done contracting
            r++;
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);

    }

    public static void main(String[] args) {
        String S = "ADOBECODEBANC", T = "ABC";
        minWindow(S, T);
    }
}
