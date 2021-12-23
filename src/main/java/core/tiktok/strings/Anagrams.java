package core.tiktok.strings;

import java.util.Arrays;

public class Anagrams {


    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Care";
        System.out.println(isAnagram(str1,str2));
    }

    public static boolean isAnagram(String str1, String str2){

        boolean result = false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check if length is same
        if(str1.length() == str2.length()) {
            // convert strings to char core.array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the char core.array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
             result = Arrays.equals(charArray1, charArray2);

            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }


        return result;
    }


}
