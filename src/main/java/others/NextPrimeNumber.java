package others;

import java.math.BigInteger;

public class NextPrimeNumber {

    public static void main(String[] args) {
        int n = 5;
        nextPrimeNum(n);
    }

    public static BigInteger nextPrimeNum(int num) {
        int next = num;
        BigInteger bi = new BigInteger(String.valueOf(num));
        System.out.println(bi.isProbablePrime(1));

        System.out.println(bi.nextProbablePrime());
        return bi.nextProbablePrime();

    }

}
