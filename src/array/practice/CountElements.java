package array.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountElements {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 1, 1};
        LinkedHashMap<Integer, Integer> lhm = countElements(arr);
        for (Map.Entry<Integer, Integer> entry : lhm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static LinkedHashMap<Integer, Integer> countElements(int[] arr) {
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
        for (int i : arr) {
            if (!lhm.containsKey(i))
                lhm.put(i, 1);
            else
                lhm.put(i, lhm.get(i) + 1);
        }

        return lhm;
    }
}
