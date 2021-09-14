//Remove duplicates from sorted core.array
//Given a sorted core.array, the task is to remove the duplicate elements from the core.array.
package core.array;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArrayWithExtraSpaceN {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {1, 1, 1, 2, 2, 3, 4, 4, 5, 5};
        removeDuplicatesFromSortedArray(arr, arr.length);
        int[] arr1 = {1, 1, 1};
        removeDuplicatesFromSortedArray(arr1, arr1.length);
        int[] arr2 = {1, 2, 2};
        removeDuplicatesFromSortedArray(arr2, arr2.length);
    }

    //Using 0(n)
    public static void removeDuplicatesFromSortedArray(int[] arr, int len) {
        List<Integer> ulist = new ArrayList<Integer>();
        int i = 0;

        while (i < len - 1) {
            if (arr[i] != arr[i + 1]) {
                ulist.add(arr[i]);
            }
            i++;
        }
        ulist.add(arr[len - 1]);
        System.out.println("Size is :" + ulist.size());
        for (int item :
                ulist) {
            System.out.println(item);

        }


    }


    //Using 0(n)
    public static void removeDuplicatesFromSortedArrayWithConstantExtraSpace(int[] arr, int len) {
        List<Integer> ulist = new ArrayList<Integer>();
        int i = 0, j = 0;

        while (i < len - 1) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
            i++;
        }
        arr[j] = arr[len - 1];
        System.out.println("Size is : " + j);
        for (int k = 0; k < j; k++) {
            System.out.println(arr[k]);

        }


    }
}
	

