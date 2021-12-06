package core.tiktok.strings;

public class _67_AddBinary {

    //https://leetcode.com/problems/add-binary/
    //https://leetcode.com/problems/add-binary/discuss/24488/Short-AC-solution-in-Java-with-explanation

    public static void main(String[] args) {

        System.out.println(addBinary("1100", "1101"));

    }

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum = sum + a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum = sum + b.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}
