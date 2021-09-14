package core.array;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int len = arr.length;
        // int i=0; j=len-1;
        int temp = 0;
        for (int i = 0, j = len - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
