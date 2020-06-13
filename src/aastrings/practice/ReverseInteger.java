package aastrings.practice;

/**
 * Created by Ashok Kolli on 5/25/2020
 */

public class ReverseInteger {

    public static int reverse(int x) {
        if (Integer.MAX_VALUE < x || Integer.MIN_VALUE > x)
            return 0;
        String str = String.valueOf(x);
        StringBuilder sb;
        if (x < 0) {
            sb = new StringBuilder(str.substring(1));
            str = sb.reverse().toString();
            try {
                int a = -Integer.parseInt(str);
                return a;

            } catch (NumberFormatException e) {
                return 0;
            }
        } else {
            sb = new StringBuilder(str);
            str = sb.reverse().toString();
            try {
                int a = Integer.parseInt(str);
                return a;

            } catch (NumberFormatException e) {
                return 0;
            }
        }


    }


    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        int n = 1;
        int opt = reverse(n);
        System.out.println(opt);
    }
}
