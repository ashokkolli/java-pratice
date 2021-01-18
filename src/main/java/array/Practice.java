package array;

public class Practice {

    static int[] arrOne, arrTwo;

    public static void main(String[] arg) {
        int k = 2;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        moveKElements(arr, k);
        arrayRotation(arr, k);
        printArray(Practice.arrTwo);
    }

    static void moveKElements(int[] arr, int k) {
        arrOne = new int[2];
        for (int i = 0; i < k; i++) {
            arrOne[i] = arr[i];
            //System.out.println(arrOne[i]);
        }
    }

    static void arrayRotation(int[] arr, int k) {
        int size = arr.length;
        int j = 0;
        int[] arrTwo = new int[size];

        for (int i = 0; i < size; i++) {
            if (i < size - k)
                arrTwo[i] = arr[i + k];
        }
        for (int i = size - k; i < size; i++) {
            arrTwo[i] = arrOne[j];
            j++;
        }


    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(i);
    }


}
