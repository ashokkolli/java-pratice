package aastrings.practice;

/**
 * Created by Ashok Kolli on 6/9/2020
 */

public class ReverseInteger2 {

    public static void main(String[] args) {
        int mod;
        int rev = 0;
        int n = 123;
        if (Integer.MAX_VALUE < n)
            System.out.println("000000");
        while (n != 0) {
            mod = n % 10;
            rev = rev * 10 + mod;
            n = n / 10;
            System.out.println(" n is " + n);

        }
        System.out.println(rev);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
