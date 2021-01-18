package array.practice;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        reverseArry(arr);
    }

    public static void reverseArry(int[] arr) {
        int i = 0, j = arr.length - 1;
        int temp = 0;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int k : arr) {
            System.out.println(k);
        }

    }
}
