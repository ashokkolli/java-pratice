package core.apple.arrays;

/**
 * Created by Ashok Kolli on 4/29/2021
 */

public class RotateArrayOneByOne {

    public static void main(String[] args) {
        int[] inputArr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        int len = inputArr.length;
        leftRotate(inputArr, d, len);
        for (int i = 0; i < len; i++) {
            System.out.println(inputArr[i]);
        }
    }

    public static void leftRotate(int[] arr, int d, int len) {
        for (int i = 0; i < d; i++) {
            leftRotateByOne(arr, len);
        }

    }

    public static void leftRotateByOne(int[] inputArr, int len) {
        int temp = inputArr[0];
        for (int j = 0; j < len - 1; j++) {
            inputArr[j] = inputArr[j + 1];
        }
        inputArr[len - 1] = temp;
    }

}
