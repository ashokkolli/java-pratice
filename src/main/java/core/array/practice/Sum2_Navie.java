package core.array.practice;

public class Sum2_Navie {

    public static void main(String[] args) {

        //is it only integer
        int[] arr = {1, 4, 45, 6, 10, -8};
        int sum = 16;
        findPair(arr, sum);
    }

    public static void findPair(int[] arr, int sum) {
        bubbleSort(arr);
        int len = arr.length;
        int l = 0;
        int n = len - 1;
        while (l < n) {
            if ((arr[l] + arr[n]) == sum) {
                System.out.println(arr[l] + " " + arr[n]);
                break;
            }
            if ((arr[l] + arr[n]) > sum)
                n--;
            if ((arr[l] + arr[n]) < sum)
                l++;
        }
    }

    public static int[] bubbleSort(int[] arr) {
        //bubble core.sorting is the simplest core.sorting algo
        //It compares adjacent elements, if element on the leftside is larger than right side then it swaps
        //It requires n-1 passes required and n-i-1 swaps required. Where i is current pass number
        //Need only n-i-1 swaps are required because for each pass is completed, one large value is its right position
        int len = arr.length;
        int temp = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("=================================");
        for (int i : arr)
            System.out.println(i);
        return arr;
    }


}
