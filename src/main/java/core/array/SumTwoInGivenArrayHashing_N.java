package core.array;

import java.util.HashMap;
import java.util.Map;

public class SumTwoInGivenArrayHashing_N {

    // Naive method to find a pair in an core.array with given sum
    public static void findPair(int[] A, int sum) {
        // create an empty Hash Map
        Map<Integer, Integer> map = new HashMap<>();

        // do for each element
        for (int i = 0; i < A.length; i++) {
            // check if pair (arr[i], sum-arr[i]) exists

            // if difference is seen before, print the pair
            if (map.containsKey(sum - A[i])) {
                System.out.println("Pair found at index " +
                        map.get(sum - A[i]) + " and " + i);
                return;
            }

            // store index of current element in the map
            map.put(A[i], i);
        }

        // No pair with given sum exists in the core.array
        System.out.println("Pair not found");
    }

    // Find pair with given sum in the core.array
    public static void main(String[] args) {
        int[] A = {8, 7, 2, 5, 3, 1};
        int sum = 10;

        findPair(A, sum);
    }

}
