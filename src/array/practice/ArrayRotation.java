package array.practice;

public class ArrayRotation {
    //1. Is Array sorted
    //2. Is it a integer Array

    public static void rotateArray(int[] arr, int d) {
        int temp, j;
        for (int i = 0; i < d; i++) {
            System.out.println("i : " + i);
            temp = arr[0];
            System.out.println("temp : " + temp);
            for (j = 0; j < arr.length - 1; j++) {
                System.out.println("j : " + j);
                arr[j] = arr[j + 1];
                System.out.println("arr[j] :" + arr[j]);
            }
            arr[j] = temp;
        }
        System.out.println("=================================================");
        for (int i : arr)
            System.out.println(i);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        rotateArray(arr, d);
    }

}
