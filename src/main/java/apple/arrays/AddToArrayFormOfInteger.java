package apple.arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {9,9,9,9};
        int k = 99;
        System.out.println(addToArrayFormOfInteger(num, k));
    }

    public static List<Integer> addToArrayFormOfInteger(int[] arr, int k){
        int len = arr.length;
        List<Integer> list = new ArrayList<>();
        for(int i = len-1; i >= 0; i--){
            int sum = k+arr[i];
            list.add(sum%10);
            k = sum/10;
        }
        System.out.println(k);
        while(k!=0){
            list.add(k%10);
            k=k/10;

        }
        Collections.reverse(list);
        return  list;
    }

}
