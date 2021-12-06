//https://www.geeksforgeeks.org/count-pairs-with-given-sum/
package core.tiktok.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum_N2 {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1};
        int sum = 6;
        HashMap<Integer, Integer> map = countPairs(arr, sum);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }

    static HashMap<Integer, Integer> countPairs(int[] arr, int sum) {
        int len = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] + arr[j] == sum) {
                    map.put(i, j);
                }

            }
        }
        return map;
    }
}
