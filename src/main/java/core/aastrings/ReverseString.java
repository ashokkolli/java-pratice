package core.aastrings;

public class ReverseString {
    public static void main(String[] arg) {
        String str = "Amazon";
        char[] charArr = str.toCharArray();
        String revStr = reverseStr1(charArr, charArr.length);
        char[] revStr2 = reverseStr2(charArr, charArr.length - 1);
        System.out.println(revStr);
        System.out.println(revStr2);
    }

    static String reverseStr1(char[] charArr, int len) {
        StringBuilder sb = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            sb.append(charArr[i]);
        }
        return sb.toString();
    }

    static char[] reverseStr2(char[] charArr, int right) {
        char temp;
        int left;
        for (left = 0; left < right; left++, right--) {
            temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
        }
        return charArr;
    }

}
