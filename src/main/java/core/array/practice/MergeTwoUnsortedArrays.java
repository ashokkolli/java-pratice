package core.array.practice;

public class MergeTwoUnsortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {8, 4, 9, 2, 2};
        int[] arr2 = {5, 1, 3, 3};
        //1. Once, it is merged, do you want to return ascending or descending order
        //2. If both arrays size is zero, we do not perform merging
        //3. What should we do, if one has length zero and other has 1 or more, as there is concept of merging..
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] arr3 = new int[len1 + len2];
        arr1 = sort(arr1, len1);
        /*for(int i : arr1){
            System.out.println(i);
        }*/
        arr2 = sort(arr2, len2);
      /*  for(int i : arr2){
            System.out.println(i);
        }*/
        arr3 = mergeTwoUnsortedArrays(arr1, arr2, len1, len2);
        for (int i : arr3) {
            System.out.println(i);
        }
    }

    public static int[] mergeTwoUnsortedArrays(int[] arr1, int[] arr2, int len1, int len2) {
        int[] merge = new int[len1 + len2];
        int i = 0, j = 0, k = 0;
        //1. Sort each core.array
        //2. Apply Merge algo
        //check if arrays size is zero
        //check if any core.array has non-digits
        if (len1 == 0 | len2 == 0)
            return merge;
        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                merge[k++] = arr1[i++];
            } else {
                merge[k++] = arr2[j++];
            }
        }
        while (i < len1)
            merge[k++] = arr1[i++];
        while (j < len2)
            merge[k++] = arr1[j++];
        return merge;
    }

    public static int[] sort(int[] arr, int len) {
        int k = 0;
        int temp;
        int[] sortedArr = new int[len];
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }

}
