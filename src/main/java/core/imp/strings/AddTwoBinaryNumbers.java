package core.imp.strings;

public class AddTwoBinaryNumbers {
    public static void main(String[] args) {
        String a = "1101", b="100";
        System.out.println(addBinaryNum(a, b));
    }

    public static String addBinaryNum(String str1, String str2){
        int n1 = str1.length()-1;
        int n2 = str2.length()-1;
        if(n1 < n2) addBinaryNum(str2, str1);
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(n1 >= 0 && n2 >= 0){
            if(str1.charAt(n1) == '1')
                ++carry;
            if(str2.charAt(n2) == '1')
                ++carry;
            if(carry % 2 == 1)
                sb.append('1');
            else sb.append('0');
            carry /=2;
            n1--;
            n2--;
        }
        System.out.println(carry);
        if(carry == 1)
            sb.append('1');
        sb.reverse();

        return sb.toString();
    }
}
