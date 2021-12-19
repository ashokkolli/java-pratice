package core.tiktok.strings.slidingwindow;

import java.util.HashMap;

public class _340_LongestSubStringWithKDistinctCharacters {
    public static void main(String[] args) {
        String str = "eceba";
        int x = longestSubStringWithKDistinctCharacters(str, 3);
        System.out.println(x);
    }

    /*
    https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/solution/
    * overall time complexity is \mathcal{O}(N k)O(Nk).
    *
    * */

    public static int longestSubStringWithKDistinctCharacters(String str, int k) {
        int maxLength = 0;
        String maxString = "";
        int i = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int len = str.length();
        for (int j = 0; j < len; j++) {
            char ch = str.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map.size() <= k) {
                maxLength = Math.max(maxLength, j - i + 1);
                maxString = str.substring(i, j - i + 1);
            } else {
                while (map.size() > k) {
                    ch = str.charAt(i);
                    if (map.get(ch) == 1)
                        map.remove(ch);
                    else
                        map.put(ch, map.get(ch) - 1);
                }
                i++;
            }

        }
        System.out.println(maxString);
        return maxLength;
    }


}
