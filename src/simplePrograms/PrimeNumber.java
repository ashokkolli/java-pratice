//https://www.youtube.com/watch?v=aG7J3m3vlNA&list=PLeIMaH7i8JDjw0uHGG1AwB8M2DwDS4-Nk&index=2

package simplePrograms;

public class PrimeNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 113;

        //Method 1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("given number is not a prime number");
                break;
            }

        }

        //Method 2
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("given number is not a prime number");
                break;
            }

        }
    }

}
