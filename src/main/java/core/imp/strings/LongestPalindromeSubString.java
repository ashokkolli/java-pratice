package core.imp.strings;

public class LongestPalindromeSubString {
    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        //longestPalindromeSubString_BT(str);
        longestPalindromicSubString(str);
    }

    public static int longestPalindromeSubString_BT(String str) {
        if(str == null || str.isEmpty()) return 0;
        if(str.length() < 2)
            return 1;
        String longPalindrome = "";
        int maxLen = 0;
        int len = str.length();

        for (int i = 0; i < len - 1; i++) {
            for (int j = i; j < len; j++) {
                // you do not have to start with j = 0; as each char
                // itself a palindrome;
                String subStr = str.substring(i, j + 1);
                if (isPalindrome(subStr)) {
                    if (maxLen < subStr.length()) {
                        longPalindrome = subStr;
                        maxLen = subStr.length();
                    }
                }
            }
        }

        System.out.println(maxLen);
        System.out.println(longPalindrome);
        return maxLen;
    }

    static boolean isPalindrome(String s) {
        String reversedStr = new StringBuilder(s).reverse().toString();
        return s.equals(reversedStr);
    }

    public static int longestPalindromicSubString(String str){
        if(str == null || str.isEmpty()) return 0;
        if(str.length() < 2) return 1;
        int start = 0;
        int end = 0;
        int len = 0;

        for(int i = 0; i  < str.length(); i++){
            int len1 = expandAroundCenter(str, i, i);
            int len2 = expandAroundCenter(str, i, i+1);
            len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        System.out.println(str.substring(start, end + 1).length());
        return str.substring(start, end + 1).length();

    }

    public static int expandAroundCenter(String str, int left, int right){
        while(left >=0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left --;
            right ++;
        }
        return  right - left - 1;
    }

}
