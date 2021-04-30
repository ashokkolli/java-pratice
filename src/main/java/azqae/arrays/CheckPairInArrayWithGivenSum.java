package azqae.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Ashok Kolli on 4/28/2021
 */

public class CheckPairInArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int sum = -2;
        List<Integer> list = getPair(arr, sum);
        System.out.println(list);
    }

    public static List<Integer> getPair(int[] arr, int sum) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];
            if (set.contains(temp)) {
                list.add(temp);
                list.add(arr[i]);
            }
            set.add(arr[i]);
        }
        return list;

    }
}
