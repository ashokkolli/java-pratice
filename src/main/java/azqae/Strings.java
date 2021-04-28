package azqae;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by Ashok Kolli on 4/4/2021
 */

public class Strings {

    @Test
    public void lengthOfLongestSubStringTest() {
        System.out.println(getLengthOfLongestSubString("ABDEFGZXtA"));
    }

    public int getLengthOfLongestSubString(String inputString) {
        int start = 0;
        int end = 0;
        int inputStringLength = inputString.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < inputStringLength; i++) {
            if (map.containsKey(inputString.charAt(i))) {
                start = Math.max(start, map.get(inputString.charAt(i)) + 1);
            }
            map.put(inputString.charAt(i), i);
            end = Math.max(end, i - start + 1);
        }
        return end;
    }

    @Test
    public void reverseString() {
        String strInput = "String";
        Assert.assertTrue(reverseString(strInput).contains("gnirtS"));
    }

    @Test
    public void reverseWordsInStringTest() {
        String inputString = "";
        getReverseWordsInString(inputString);
    }

    public String getReverseWordsInString(String str) {
        String[] strArr = str.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for (String strA : strArr) {

        }
        return "";
    }

    public String reverseString(String strInput) {
        StringBuilder stringBuilder = new StringBuilder(strInput.length());
        for (int i = strInput.length() - 1; i >= 0; i--) {
            stringBuilder.append(strInput.charAt(i));
        }
        String reverseString = stringBuilder.toString();
        System.out.println(reverseString);
        return reverseString;
    }
}
