package core.others;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers1ToN {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> list = primeNumbers(25);
        for (int i : list) {
            System.out.println(i);
        }

    }

    public static List<Integer> primeNumbers(int n) {
        List<Integer> list = new ArrayList<Integer>();
        int k = 0, i = 0;
        for (i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 0) {
                list.add(i);
                k++;
            }
        }
        return list;

    }

}
