package array.practice;

import java.util.Arrays;

public class IntersectionAndUnionOfArrays {

    //1. is it a char or digits array
    //2. What is the max and min length of arrays

    public static void main(String[] args) {
        int[] arr1 = {7, 1, 5, 2, 3, 6};
        int[] arr2 = {3, 8, 6, 20, 7};
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] output = instersection(arr1, len1, arr2, len2);
        for (int i : output)
            System.out.println(i);
        System.out.println("====================================================");
  /*      output = union(arr1, len1, arr2, len2);
        for(int i : output)
            System.out.println(i);
*/
    }

    //Union method is wrong have to work on
   /* public static int[] union(int[] arr1, int len1, int[] arr2, int len2){
        int[] arr3 = new int[0];
        *//*int arr1[] = {7, 1, 5, 2, 3, 6};
        int arr2[] = {3, 8, 6, 20, 7};*//*
            arr3 = new int[len1+len2];
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i =0, j=0, k=0;
        while(i< len1 && j < len2){ // i=0, j=0;
            if(arr1[i]!=arr2[j]) { //7, 3
                arr3[k++] = arr1[i++];
                arr3[k++] = arr2[j++];
            }
            else break;
        }
        Arrays.sort(arr3);
        return  arr3;
    }
*/
    public static int[] instersection(int[] arr1, int len1, int[] arr2, int len2) {
        int[] arr3 = new int[0];
        if (len1 < len2) {
            arr3 = new int[len1];
            System.out.println("arr3 is length is " + len1);
        }

        if (len2 < len1) {
            arr3 = new int[len2];
            System.out.println("arr3 is length is " + len2);
        }
        int k = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        /*for(int i : arr1)
            System.out.println(i);
        for(int i : arr2)
            System.out.println(i);*/
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) {
                    //System.out.println("K "+k);
                    arr3[k++] = i;
                }
                if (i < j)
                    break;
            }
        }
        return arr3;
    }
}
