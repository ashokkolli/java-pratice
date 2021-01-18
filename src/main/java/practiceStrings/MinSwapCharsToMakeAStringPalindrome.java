package practiceStrings;

public class MinSwapCharsToMakeAStringPalindrome {
    public static void main(String[] args) {
        int minSwap = minSwapCharsToMakeAStringPalindrome("ashokkohsa");
        System.out.println(minSwap);
    }

    public static int minSwapCharsToMakeAStringPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }

        char[] charArr = str.toCharArray();
        int len = str.length();

        int j = len - 1;
        int count = 0;
        for (int i = 0; i < len / 2; i++) {
            if (charArr[i] != charArr[j - i]) {
                count = count + 1;
            }
        }
        return count;
    }
}
