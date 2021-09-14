package core.array.practice;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 0, 3};
        int[] output = moveAllZeros(arr);
        for (int i : output)
            System.out.println(i);
    }

    public static int[] moveAllZeros(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }

        }
        while (count < arr.length) {
            arr[count++] = 0;
        }

        return arr;
    }
}
