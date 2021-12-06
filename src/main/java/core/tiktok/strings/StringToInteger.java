package core.tiktok.strings;


/*
Read in and ignore any leading whitespace.
        Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
        Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
        Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
        If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
        Return the integer as the final result.
*/
public class StringToInteger {

    public static int myAtoi(String str) {
        double result = 0;
        char sign = '+';
        int index = 0;
        String tempStr = str.trim();
        if (tempStr.charAt(0) == '-') {
            sign = '-';
            index = 1;

        } else if (tempStr.charAt(0) == '+') {
            index++;
        }
        while (index < tempStr.length()) {
            if (!(tempStr.charAt(index) >= '0' && tempStr.charAt(index) <= '9'))
                return 0;
            result = result * 10 + (tempStr.charAt(index) - '0');
            index++;
        }
        if (sign == '-') {
            result = (-1) * result;
        }

        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        System.out.println((int) result);
        return (int) result;

    }

    public static void main(String[] args) {
        System.out.println(myAtoi("12345678998987777777989"));

    }

}
