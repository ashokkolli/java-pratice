package core.tiktok.strings.leetcode.easy;

import java.util.Arrays;

public class _14LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

     longestCommonPrefix(strs);

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {

            while (strs[i].indexOf(prefix) != 0) {
                System.out.println(strs[i]);
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println(prefix);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

}
