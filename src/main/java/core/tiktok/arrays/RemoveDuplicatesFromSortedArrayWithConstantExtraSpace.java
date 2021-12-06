//Remove duplicates from sorted core.array
//Given a sorted core.array, the task is to remove the duplicate elements from the core.array.
package core.tiktok.arrays;

public class RemoveDuplicatesFromSortedArrayWithConstantExtraSpace {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {1, 1, 1, 2, 2, 3, 4, 4, 5, 5};
        removeDuplicatesFromSortedArrayWithConstantExtraSpace(arr, arr.length);
        int[] arr1 = {1, 1, 1};
        removeDuplicatesFromSortedArrayWithConstantExtraSpace(arr1, arr1.length);
        int[] arr2 = {1, 2, 2};
        removeDuplicatesFromSortedArrayWithConstantExtraSpace(arr2, arr2.length);
    }

    //Using 0(1)
    public static void removeDuplicatesFromSortedArrayWithConstantExtraSpace(int[] arr, int len) {
        int i = 0, j = 0;

        while (i < len - 1) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];

            }
            i++;
        }
        arr[j++] = arr[len - 1];
        System.out.println("Size is : " + j);
        for (int k = 0; k < j; k++) {
            System.out.println(arr[k]);

        }


    }
}
	

