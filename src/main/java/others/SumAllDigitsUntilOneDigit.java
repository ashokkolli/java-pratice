package others;

public class SumAllDigitsUntilOneDigit {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Input
        int n = 9999;
        int sum = sumNum(n);
        System.out.println(sum);
        System.out.println(digSum(n));
    }

    //O(n) Approach
    public static int sumNum(int n) {
        int sum = 0;
        if (n < 10)
            return n;

        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sumNum(sum);

    }

    //O(1) Approach
    static int digSum(int n) {
        if (n == 0)
            return 0;
        return (n % 9 == 0) ? 9 : (n % 9);
    }

}
