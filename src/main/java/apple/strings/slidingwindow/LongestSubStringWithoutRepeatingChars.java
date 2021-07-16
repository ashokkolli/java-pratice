package apple.strings.slidingwindow;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingChars {

    public static void main(String[] args) {
        String str = "aabcbb";
       int x =  longestSubString(str);
        System.out.println(x);
    }

    public static int longestSubString(String str){
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int len = str.length();
        int maxLen = 0;
        while(j < len){
            char ch = str.charAt(j);
            if(!set.contains(ch)) {
                set.add(ch);
                maxLen = Math.max(maxLen, set.size());
                j++;
            }else{
                set.remove(str.charAt(i));
                i++;
            }

        }
        return maxLen;

    }
}
