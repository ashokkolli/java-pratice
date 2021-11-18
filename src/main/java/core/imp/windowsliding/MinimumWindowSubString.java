package core.imp.windowsliding;

/**
 * Created by Ashok Kolli on 7/26/2020
 */

public class MinimumWindowSubString {

    public static String minWindow(String s, String t) {
        int left = 0;
        int right = 0;
        int smallestWindow = 0;
        if (s.contains(t))
            return s.substring(s.indexOf(t), t.length() - 1);
       /* while(){

        }*/

        return "";
    }

    public static void main(String[] args) {
        String S = "ADOBECODEBANC", T = "ABC";
        minWindow(S, T);
    }
}
