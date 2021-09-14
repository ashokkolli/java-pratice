package core.leetcode;

/**
 * Created by Ashok Kolli on 7/22/2020
 */

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        int r = 0;
        int reverse = 0;
        while (x != 0) {
            r = x % 10;
            reverse = reverse * 10 + r;
            x = x / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome(123);
    }
}
