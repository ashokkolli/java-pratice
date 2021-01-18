package array;

import java.util.ArrayList;
import java.util.List;

public class PairSumCloseToX_BF {
    public static void main(String[] args) {
        //arr[] = {10, 22, 28, 29, 30, 40}, x = 54
        int[] arr = {10, 22, 28, 29, 30, 40};
        int x = 54;
        sumCloseToX(arr, x);
    }

    static void sumCloseToX(int[] arr, int x) {
        int closeSum = x;
        int x1 = Integer.MIN_VALUE, x2 = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<Integer>();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] + arr[j] < x) {
                    if (closeSum == x) {
                        closeSum = arr[i] + arr[j];
                    } else if (closeSum < arr[i] + arr[j])
                        closeSum = arr[i] + arr[j];
                    x1 = arr[i];
                    x2 = arr[j];
                }
            }

        }
        System.out.println(x1 + "  " + x2);
    }
}
