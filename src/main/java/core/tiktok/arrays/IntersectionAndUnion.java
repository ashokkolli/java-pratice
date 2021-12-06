package core.tiktok.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ashok Kolli on 4/28/2021
 */

public class IntersectionAndUnion {
    public static void main(String[] args) {
        int[] arr1 = {7, 1, 5, 2, 3, 6};
        int[] arr2 = {3, 8, 6, 20, 7};
        union(arr1, arr2);
        intersection(arr1, arr2);
    }

    public static Set<Integer> union(int[] arr1, int[] arr2) {
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            hs.add(arr2[j]);
        }
        System.out.println("Union");
        System.out.println(hs);
        return hs;
    }

    public static Set<Integer> intersection(int[] arr1, int[] arr2) {
        Set<Integer> setInput = new HashSet<Integer>();
        Set<Integer> setOutput = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            setInput.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            if (setInput.contains(arr2[j])) {
                setOutput.add(arr2[j]);
            }

        }
        System.out.println("Intersection");
        for (int l : setOutput)
            System.out.println(l);

        return setOutput;
    }
}
