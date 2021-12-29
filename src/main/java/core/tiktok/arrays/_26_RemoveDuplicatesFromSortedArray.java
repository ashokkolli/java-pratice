package core.tiktok.arrays;

import java.util.LinkedHashSet;

/**
 * Created by Ashok Kolli on 5/5/2021
 */

public class _26_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicate(arr));
    }


    //O(1) space
    public static int removeDuplicate(int[] arr) {
        int i = 0, j;
        for (j = 1; j < arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }

        }
        return i+1;


    }


    //O(n) extra space
    public static void removeDuplicate_HashSet(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++)
            set.add(arr[i]);
        System.out.println(set);
    }


}
