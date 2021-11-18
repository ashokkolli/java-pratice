package core.imp.arrays;

/*

Time complexity : O(n)
Auxiliary Space : O(d)

*/
public class ArrayRotate_TempArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        int len = arr.length;
        rotateArray(arr, len, d);
        printArray(arr);
        // Collections.rotate(Arrays.asList(arr),2);
    }

    public static void rotateArray(int[] arr, int len, int d) {
        int[] tempArr = new int[d];
        for (int i = 0; i < d; i++) {

            tempArr[i] = arr[i];
            System.out.println(tempArr[i]);
        }
        System.out.println("------------");
        for (int j = 0; j < len - d; j++) {
            arr[j] = arr[j + d];
            System.out.println(arr[j]);

        }
        System.out.println("------------");

        int m = len - d;
        for (int k = 0; k < d; k++) {
            arr[m++] = tempArr[k];
        }

    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
