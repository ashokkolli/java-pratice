package amazon.arrays;

/**
 * Created by Ashok Kolli on 5/5/2021
 */

public class TwoNumbersCloseToSum {
    public static void main(String[] args) {
        int[] inputArr = {10, 22, 28, 29, 30, 40};
        int x = 54;
        closeToSum(inputArr, x);
    }

    public static void closeToSum(int[] inputArr, int sum) {
        int closeSum = Integer.MIN_VALUE;
        for (int i = 0; i < inputArr.length - 1; i++) {
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[i] + inputArr[j] > closeSum) {
                    closeSum = inputArr[i] + inputArr[j];
                }
            }
        }
        System.out.println(closeSum);

    }
}
