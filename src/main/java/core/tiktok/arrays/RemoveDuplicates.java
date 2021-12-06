package core.tiktok.arrays;

import java.util.LinkedHashSet;

/**
 * Created by Ashok Kolli on 5/5/2021
 */

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {5, 5, 2, 2, 1, 1};

        removeDuplicate(arr);
    }

    public static void removeDuplicate(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++)
            set.add(arr[i]);
        System.out.println(set);
    }


}
