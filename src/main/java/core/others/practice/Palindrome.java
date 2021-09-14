package core.others.practice;

public class Palindrome {

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;

        }
        return true;
    }

    public static void main(String[] str) {
        int x = 12221;
        System.out.println(isPalindrome(x));
    }
}
