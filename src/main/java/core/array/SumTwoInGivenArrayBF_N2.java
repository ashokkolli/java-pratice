package core.array;

public class SumTwoInGivenArrayBF_N2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 12};
        int target = 9;
        findPair(arr, target);
    }

    static void findPair(int[] arr, int target) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("i and j " + i + " " + j);
                    break;

                }
            }
        }


    }

}
