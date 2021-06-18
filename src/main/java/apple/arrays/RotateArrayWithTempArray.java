package apple.arrays;

/**
 * Created by Ashok Kolli on 4/29/2021
 */

public class RotateArrayWithTempArray {
    public static void main(String[] args) {
        int[] inputArr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        rotateArray(inputArr, d);

    }

    public static int[] rotateArray(int[] inputArr, int d) {
        int[] tempOut = new int[inputArr.length];

        int l = 0;
        for (int j = d; j < inputArr.length; j++) {
            tempOut[l++] = inputArr[j];
        }
        for (int k = 0; k < d; k++)
            tempOut[l++] = inputArr[k];

        for (int i = 0; i < inputArr.length; i++)
            System.out.println(tempOut[i]);

        return tempOut;
    }
}
