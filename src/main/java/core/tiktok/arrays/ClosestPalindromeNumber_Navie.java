package core.tiktok.arrays;

public class ClosestPalindromeNumber_Navie {
    public static void main(String[] args) {
        int num = 123;
        int closestPal = closestPalindrome(num);
        System.out.println(closestPal);
    }

    static int closestPalindrome(int n) {
        int rp = n + 1;
        int lp = n - 1;
        while (!isPalindrom(Math.abs(lp))) {
            lp--;
        }

        while (!isPalindrom(Math.abs(rp))) {
            rp++;
        }
//        System.out.println(rp);
//        System.out.println(lp);
        if (Math.abs(n - lp) > Math.abs(rp - n))
            return rp;
        else
            return lp;

    }

    static boolean isPalindrom(int lp) {
        String pal = Integer.toString(lp);
        return pal.equals(new StringBuilder(pal).reverse().toString());
    }
}
