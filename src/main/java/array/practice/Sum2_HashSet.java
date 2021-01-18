package array.practice;

import java.util.HashSet;

public class Sum2_HashSet {

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, -8};
        int sum = 16;
        int[] ouputArr = findPair(arr, sum);
        for (int i : ouputArr)
            System.out.println(i);
    }

    public static int[] findPair(int[] arr, int sum) {
        //Put it in HashMap
        int[] pairArr = new int[2];
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];
            pairArr[0] = temp;
            if (hs.contains(temp)) {
                pairArr[1] = arr[i];
                break;
            } else
                hs.add(arr[i]);
        }
        return pairArr;

    }

    public static int[] bubbleSort(int[] arr) {
        //bubble sorting is the simplest sorting algo
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
