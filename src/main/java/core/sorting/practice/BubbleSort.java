package core.sorting.practice;

public class BubbleSort {

    public static void main(String[] str) {
        int[] intArr = {20, 35, -15, 7, 55, 1, -22};
        sort(intArr);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1])
                    swap(array, j, j + 1);
            }
        }
        for (int k = 0; k < array.length - 1; k++)
            System.out.println(array[k]);

    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
