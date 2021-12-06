//Remove duplicates from sorted core.array
//Given a sorted core.array, the task is to remove the duplicate elements from the core.array.
package core.tiktok.arrays;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArrayUsingHashMap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {1, 1, 1, 2, 2, 3, 4, 4, 5, 5};
        removeDuplicatesFromSortedArray(arr, arr.length);
        int[] arr1 = {1, 1, 1};
        removeDuplicatesFromSortedArray(arr1, arr1.length);
        int[] arr2 = {1, 2, 2};
        removeDuplicatesFromSortedArray(arr2, arr2.length);
    }

    //Using 0(1)
    public static void removeDuplicatesFromSortedArray(int[] arr, int len) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
        System.out.println("----------------------------");

    }

}
	

