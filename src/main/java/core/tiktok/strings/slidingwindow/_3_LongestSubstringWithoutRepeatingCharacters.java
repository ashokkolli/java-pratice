package core.tiktok.strings.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/discuss/1729/11-line-simple-Java-solution-O(n)-with-explanation

public class _3_LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
       /* String str = "aabcbb";
       int x =  longestSubString(str);
        System.out.println(x);*/
        longestSubString_bf("abcabcbb");
    }


    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1); // max is required in cases of "abba"
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }

    public static int longestSubString_hashset(String str){
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

    public static int longestSubString_bf(String str){
        int len = str.length();
        int res = 0;
        for(int i = 0; i < len; i++){
            for(int j = i; j < len; j++){
                if(isAllUnique(str, i, j)){
                    res = Math.max(res, j-i+1);
                }
            }
        }
        return  res;
    }

    private static boolean isAllUnique(String str, int start, int end){
        int[] chars = new int[128];
        //If I need to check a string has unique characters,
        // I understand if we are considering characters in Ascii table, then there will 128 of them.

        for(int i = start; i<=end; i++){
            char c = str.charAt(i);
            chars[c] = chars[c] + 1;
            if(chars[c] > 1)
                return false;
        }

        return true;
    }


}
