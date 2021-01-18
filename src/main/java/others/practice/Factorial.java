package others.practice;

import java.math.BigInteger;

/**
 * Created by Ashok Kolli on 5/29/2020
 */

public class Factorial {
    public static BigInteger findFact(int n) {
        if (n == 0) {
            return BigInteger.valueOf(1);//            return BigInteger.Zero;

        } else
            return BigInteger.valueOf(n).multiply(findFact(n - 1));

    }

    public static void main(String[] args) {
        BigInteger fact = findFact(99);
        System.out.println(fact);

    }
}
