package core.aastrings;

public class ConvertCharToASCIINumeric {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "0123456789";
        convertToASCII(str);
    }

    public static void convertToASCII(String str) {
        for (char c : str.toCharArray()) {
            int ascii = c;
            System.out.println(ascii);
        }
        System.out.println();

        //Another Approach
        byte[] bytes = str.getBytes();

        for (byte c : bytes) {
            System.out.println(c);
        }


    }


}
