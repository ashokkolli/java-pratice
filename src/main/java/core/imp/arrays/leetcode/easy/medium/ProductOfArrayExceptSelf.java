package core.imp.arrays.leetcode.easy.medium;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 4};
        product_bf(arr);
    }

    public static void product_bf(int[] arr) {
        int[] output = new int[arr.length];
        int product = 1;
        for (int n : arr) {
            if (n != 0) // When any element is zero
                product = product * n;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                output[i] = 0;
            } else
                output[i] = product / arr[i];
            System.out.println(output[i]);
        }

    }
}
