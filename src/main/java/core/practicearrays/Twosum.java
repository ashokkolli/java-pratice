package core.practicearrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Twosum {

    public static List<Integer> twoSum(int[] arr, int target) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(target - arr[i])) {
                list.add(i);
                // System.out.println(arr[i] + " " +(target-arr[i]));
                list.add(hm.get(target - arr[i]));
                // break;
            } else
                hm.put(arr[i], i);
        }
        return list;
    }

    public static void main(String[] str) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 7;
        List<Integer> list = twoSum(arr, target);
        System.out.println(list.get(0) + " " + list.get(1));
        System.out.println(list.get(2) + " " + list.get(3));

    }

}
