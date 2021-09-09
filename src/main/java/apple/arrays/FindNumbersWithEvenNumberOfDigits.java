package apple.arrays;
import java.util.ArrayList;
import java.util.List;


public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        int[] arr = {1, 22, 333, 4444, 55555};
        System.out.println(findNumbersWithEvenNumbersOfDigits(arr));
    }
    public static int findNumbersWithEvenNumbersOfDigits(int[] arr){

        int count = 0;
        int n;
        for(int num : arr) {
            n = numberOfDigits(num);
            if (n % 2 == 0)
                count++;
        }
        return count;
    }

    public static int numberOfDigits(int num){
        int digits = 0;
        while(num!=0){
            num =num/10;
            digits++;
        }
        return digits;
    }

}
