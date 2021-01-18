package array;

public class MoveAllZerosToEndOfArray {

    //Given input Array arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
    //Output {1, 2, 3, 4, 5, 0, 0, 0}
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int len = arr.length;
        moveToEnd(arr, len);
        printArray(arr, len);
    }

    public static void moveToEnd(int[] arr, int len) {
        int count = 0;
        for (int i = 0; i < len; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];

        while (count < len)
            arr[count++] = 0;

    }

    public static void printArray(int[] arr, int len) {
        for (int i : arr)
            System.out.println(i);
    }

}
