package core.array;

import java.util.Arrays;

public class RearrangeArrayEvenPositionedGreaterThanOdd {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Position starts with 1, index start with 0
        int[] arr = {1, 3, 2, 2, 5};
        int len = arr.length;
        rearrange(arr, len);
    }

    public static void rearrange(int[] arr, int len) {
        Arrays.sort(arr);

        int p = 0, q = len - 1;
        int[] opArr = new int[len];
        //Position starts with 1, index start with 0
        for (int i = 0; i < len; i++) {
            if ((i + 1) % 2 == 0)
                opArr[i] = arr[q--];
            else
                opArr[i] = arr[p++];
        }
        for (int ele : opArr)
            System.out.println(ele);
    }


}
