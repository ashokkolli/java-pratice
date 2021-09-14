package core.array.practice;

import java.util.HashSet;

public class InterSectionAndUnion_HashSET {

    public static void main(String[] args) {

        int[] arr1 = {7, 1, 5, 2, 3, 6};
        int[] arr2 = {3, 8, 6, 20, 7};
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] output = instersection(arr1, len1, arr2, len2);
        /*for (int i : output)
            System.out.println(i);
*/
        output = union(arr1, len1, arr2, len2);
        for (int i : output)
            System.out.println(i);
    }

    public static int[] instersection(int[] arr1, int len1, int[] arr2, int len2) {
        HashSet<Integer> hashset = new HashSet<Integer>();
        int[] outputArr = new int[0];
        int k = 0;
        if (len1 < len2)
            outputArr = new int[len1];
        if (len2 < len1)
            outputArr = new int[len2];
        for (int i : arr1)
            hashset.add(i);
        for (int i : arr2) {
            if (hashset.contains(i))
                outputArr[k++] = i;
        }
        return outputArr;
    }

    public static int[] union(int[] arr1, int len1, int[] arr2, int len2) {
        HashSet<Integer> hashset = new HashSet<Integer>();
        int[] outputArr = new int[0];
        int k = 0;
        outputArr = new int[len1 + len2];
        for (int i : arr1)
            hashset.add(i);
        for (int i : arr1)
            hashset.add(i);
        for (int i : hashset)
            outputArr[k++] = i;
        return outputArr;
    }
}