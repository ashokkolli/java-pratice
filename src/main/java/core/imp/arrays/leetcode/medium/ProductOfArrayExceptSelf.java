package core.imp.arrays.leetcode.medium;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        product(arr);
    }


    public static int[] product(int[] arr){

        int len = arr.length;
        // The left and right arrays as described in the algorithm

        int[] L = new int[len];
        int[] R = new int[len];
        // Final answer array to be returned

        int[] res = new int[len];



        // L[i] contains the product of all the elements to the left
        // Note: for the element at index '0', there are no elements to the left,
        // so L[0] would be 1
        L[0] = 1;
        for(int i = 1; i < len; i++ ){
            L[i] = L[i - 1] * arr[i-1];
            System.out.println(L[i]);
        }

        // R[i] contains the product of all the elements to the right
        // Note: for the element at index 'length - 1', there are no elements to the right,
        // so the R[length - 1] would be 1

        System.out.println(" ");

        R[len - 1] = 1;
        for(int i = len - 2; i>=0; i--){
            R[i] = R[i+1] * arr[i +1];
            System.out.println(R[i]);
        }

        System.out.println(" ");

        // Constructing the answer array
      for (int i = 0; i < len; i++) {
            // For the first element, R[i] would be product except self
            // For the last element of the array, product except self would be L[i]
            // Else, multiple product of all elements to the left and to the right
            res[i] = L[i] * R[i];
          System.out.println(res[i]);

      }
        return res;


    }

    public static int[] product_bf(int[] arr) {
        int[] output = new int[arr.length];
        int product = 1;
        for (int n : arr) {
            if (n != 0) // When any element is zero
                product = product * n;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                output[i] = 0;
            } else
                output[i] = product / arr[i];
            System.out.println(output[i]);
        }
        return output;

    }


}
