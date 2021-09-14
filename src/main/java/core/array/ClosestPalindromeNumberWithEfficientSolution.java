package core.array;

public class ClosestPalindromeNumberWithEfficientSolution {

//    An efficient solution is to consider following cases.
//
//    Case 1: If a number contains all 9’s then we get next closest Palindrome by simply adding 2 in it. num = 999 : output : num + 2 = 1001.
//
//    Case 2:
//    Case 2 a :One possible way to getting closest palindromic by Copy first half and add mirror image at the end if it. Left half : For example, left side of “123 456” is “123” and left half of “12345” is “1 2”. To convert to palindrome, we can either take the mirror of its left half or take mirror of its right half. However, if we take the mirror of the right half, then the palindrome so formed is not guaranteed to be the closest palindrome. So, we must take the mirror of left side and copy it to right side.
//
//    Let's number : 123456
//    After copy and append reverse of it at the end number looks like:
//    we get palindrome 123321

    public static void main(String[] args) {
        int num = 12313;

        closestPalindrome(num);
    }

    public static void closestPalindrome(int num) {
        String strNum = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        if (num % 9 == 0) {
            while (num > 0) {
                num = num / 10;
                count++;
            }

            /// Add 2s to each 9
        }
        if (strNum.length() % 2 == 0) {
            for (int i = 0; i < strNum.length() / 2 - 1; i++) {
                sb.append(strNum.charAt(i));
            }
            for (int i = strNum.length() / 2 - 1; i >= 0; i--) {
                sb.append(strNum.charAt(i));
            }
            System.out.println(sb.toString());
        }
        if (strNum.length() % 2 == 1) {
            int i;
            for (i = 0; i < strNum.length() / 2; i++) {
                sb.append(strNum.charAt(i));
            }
            sb.append(strNum.charAt(i));
            for (int j = strNum.length() / 2 - 1; j >= 0; j--) {
                sb.append(strNum.charAt(j));
            }
            System.out.println(sb.toString());
        }

    }

}
