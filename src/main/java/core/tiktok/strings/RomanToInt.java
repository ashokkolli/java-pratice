package core.tiktok.strings;

import java.util.HashMap;
import java.util.Map;


public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("DXCI"));
    }

    public static int romanToInt(String romanStr) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('M', 1000);
        romanMap.put('D', 500);
        romanMap.put('C', 100);
        romanMap.put('L', 50);
        romanMap.put('X', 10);
        romanMap.put('V', 5);
        romanMap.put('I', 1);

        int sum = 0;
        int i = 0;
        while (i < romanStr.length() - 1) {
            char currSymbol = romanStr.charAt(i);
            int currValue = romanMap.get(currSymbol);

            char nextSymbol = romanStr.charAt(i + 1);
            int nextValue = romanMap.get(nextSymbol);

            if (currValue < nextValue) {
                sum = sum + nextValue - currValue;
                i += 2;
            } else {
                sum += currValue;
                i += 1;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
