package core.imp.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Ashok Kolli on 5/15/2021
 */

public class StringCompression {
    // Objective: Write an algorithm to compress the given string by using the count of repeated characters
    // and if new compressed string length is not smaller than the original string then return the original string.

    public static void main(String[] args) {
        /* int i = compress("aabaacc".toCharArray());
        System.out.println(i);
*/


    }


//https://leetcode.com/problems/string-compression/discuss/92559/Simple-Easy-to-Understand-Java-solution

    public static int compress(char[] chars) {
        int len = 0, i = 0;
        while(i < chars.length){
            char curr = chars[i];
            int count = 0;
            while(i < chars.length && chars[i] == curr){
                i++;
                count++;
            }
            chars[len++] = curr;
            if(count > 1)
                for(char c : String.valueOf(count).toCharArray()) { // when count is two digits or more than 9
                    chars[len++] = c;
                }
        }
        return len;
    }

}
