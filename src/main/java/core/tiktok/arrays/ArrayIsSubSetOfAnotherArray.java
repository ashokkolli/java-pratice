package core.tiktok.arrays;


//https://www.geeksforgeeks.org/find-whether-an-array-is-subset-of-another-array-set-1/

import java.util.HashSet;

public class ArrayIsSubSetOfAnotherArray {

    public static void main(String[] args){

        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };

        int m = arr1.length;
        int n = arr2.length;

        if (isSubset(arr1, arr2, m, n))
            System.out.println("arr2 is a subset of arr1");
        else
            System.out.println(
                    "arr2 is not a subset of arr1");


        if (isSubset(arr1, arr2))
            System.out.print("arr2[] is "
                    + "subset of arr1[] ");
        else
            System.out.print("arr2[] is "
                    + "not a subset of arr1[]");
    }


    /* Return true if arr2[] is a subset of arr1[] */
    static boolean isSubset(int arr1[],
                            int arr2[], int m,
                            int n)
    {
        HashSet<Integer> hset = new HashSet<>();

        // hset stores all the values of arr1
        for (int i = 0; i < m; i++) {
            if (!hset.contains(arr1[i]))
                hset.add(arr1[i]);
        }

        // loop to check if all elements
        //  of arr2 also lies in arr1
        for (int i = 0; i < n; i++)
        {
            if (!hset.contains(arr2[i]))
                return false;
        }
        return true;
    }



    public static boolean isSubset(int[] arrA, int[] arrB){
        int aLen = arrA.length;
        int bLen = arrB.length;
        int i, j;
        for(i = 0; i < bLen ; i++ ){
            for(j = 0; j < aLen; j++){
                if(arrB[i] == arrA[j])
                    break;
            }
             /* If the above inner loop
            was not broken at all then
            arr2[i] is not present in
            arr1[] */
            if(j == aLen)
                return false;
        }
        return true;
    }




}
