package array.practice;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 1};
        List<Integer> list = removeDuplicatesHS(arr);
        for (int val : list)
            System.out.println(val);

    }

    public static List<Integer> removeDuplicates(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else
                map.put(arr[i], map.get(arr[i]) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(entry.getKey());
        }
        return list;
    }

    public static List<Integer> removeDuplicatesHS(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);

        }
        for (int i : set)
            list.add(i);
        return list;
    }

}
