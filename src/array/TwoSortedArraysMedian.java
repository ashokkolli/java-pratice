package array;

public class TwoSortedArraysMedian {

//give arr1 and arr2
//compare arr[1] with arr2[2] first element
//if arr1[i] < arr2[j] move arr1[i]it to temp
// if arr1[i] > arr2[j]

    public static void main(String[] str) {

        int[] arr1 = {1, 12, 15, 26, 38};
        int[] arr2 = {2, 13, 17, 30, 45};
        median(arr1, arr2);
    }


    public static void median(int[] arr1, int[] arr2) {
        int arlen1 = arr1.length;
        int arlen2 = arr2.length;
        int[] temp = new int[arlen1 + arlen2];
        System.out.println("total length is :" + (arlen1 + arlen2));
        int k = 0;
        for (int i = 0; i < arlen1; i++) {

            for (int j = 0; j < arlen2; j++) {
                if (arr1[i] <= arr2[j]) {
                    temp[k] = arr1[i];
                    k++;
                }
                if (arr2[j] <= arr1[i]) {
                    System.out.println(" J is : " + j + " K is :" + k);
                    temp[k] = arr2[j];
                    k++;
                    System.out.println("K is :" + k);
                }

            }
        }
        for (int i = 0; i < arlen1 + arlen2; i++) {
            System.out.println(temp[i]);
        }
    }


}
