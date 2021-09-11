package apple.strings;

public class SumTwoLargeNumbers {

    public static void main(String[] args) {
        String str1 = "12";
        String str2 = "198111";
        System.out.println(sumTwoLargeNumbers(str1, str2));

    }

    public static String sumTwoLargeNumbers(String str1, String str2){
        //1. find length of two stings
        //2. find Sum and carry
        //3. add Sum to output string
        //4. Add remaining digits's Sum and carry and add sum to output sting
        //5. Add carry to output String
        //4. Reverse a String

        //Find length
        int len1 = str1.length()-1;
        int len2 = str2.length()-1;
        int carry =0;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(len1 >= 0 && len2 >= 0 ){
           int  sum =  (str1.charAt(len1) - '0') + (str2.charAt(len2) - '0')
                    + carry;
            carry = sum/10;
            sb.append((char)(sum%10+'0'));
            len1--;
            len2--;
        }
        while(len1 >= 0){

            int sum =  (str1.charAt(len1) - '0')  + carry;
            carry = sum/10;
            sb.append((char)(sum%10+'0'));
            len1--;

        }

        while(len2 >= 0){

            int sum =  (str2.charAt(len2) - '0')  + carry;
            carry = sum/10;
            sb.append((char)(sum%10+'0'));
            len2--;
        }

        if(carry > 0){
            carry = carry+'0';
            sb.append((char)carry);
        }

        return  sb.reverse().toString();
    }

}
