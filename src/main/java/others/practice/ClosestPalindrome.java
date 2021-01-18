package others.practice;

public class ClosestPalindrome {

    //find closest Palindrome
    //return int
    public static int findClosestPalindrome(int x) {
        //Let's take closest Palindrome
        int LCP = x - 1;
        int RCP = x + 1;
        while (!isPalindrome(LCP))
            LCP--;
        System.out.println(LCP);
        while (!isPalindrome(RCP))
            RCP++;
        System.out.println(RCP);
        if ((x - LCP) > (RCP - x))
            System.out.println(RCP);
        else System.out.println(LCP);
        return 0;
    }

    //find palindrome
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;

        return true;
    }


    //Driver
    public static void main(String[] args) {
        //Data
        int x = 123;
        //should return int

        findClosestPalindrome(x);
    }
}
