package core.array;

import java.util.ArrayList;

public class MaxAndMinElementInArray {
    public static void main(String[] args) {


        int[] arr = {10, 100, 50, 30, 40, 120, 160};
        int len = arr.length;
        ArrayList<Integer> list = maxelement(arr, len);

        System.out.println(list.get(0));
        System.out.println(list.get(1));

    }

    static ArrayList<Integer> maxelement(int[] arr, int len) {
//        int max=Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
        int max = arr[0];
        int min = arr[0];
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (arr == null || len < 2) {
            System.out.println("core.array length should be atleaset 2");
        }
        for (int i = 1; i < len; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        list.add(max);
        list.add(min);


        return list;
    }
}
