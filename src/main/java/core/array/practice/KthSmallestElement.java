package core.array.practice;

public class KthSmallestElement {

    public static int findKthSmallestElement(int[] arr, int k) {
        arr = bubbleSort(arr);
        int len = arr.length;
        return arr[k - 1];
    }

    public static int[] bubbleSort(int[] arr) {
        int len = arr.length;
        int temp;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("After core.sorting ");
        for (int i : arr)
            System.out.println(i);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("Before Sort");
        for (int i : arr)
            System.out.println(i);
        int out = findKthSmallestElement(arr, k);
        System.out.println("Kth SmallestElement : " + out);
    }
}
