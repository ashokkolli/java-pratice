package core.imp.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesFromUnsortedArrayUsingLinkedHashMap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {7, 7, 2, 2, 3, 4, 4, 1, 1, 1, 2, 2, 2, 5, 5};
        removeDuplicatesFromSortedArray(arr, arr.length);
        int[] arr1 = {1, 1, 1};
        removeDuplicatesFromSortedArray(arr1, arr1.length);
        int[] arr2 = {1, 2, 2};
        removeDuplicatesFromSortedArray(arr2, arr2.length);
        reverseString();
    }

    //Using 0(1)
    public static void removeDuplicatesFromSortedArray(int[] arr, int len) {

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
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

    public static void reverseString() {
        String str = "Geeks for Geeks";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
