package core.tiktok.strings;

public class IntToRoman {
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public static void main(String[] args) {
        System.out.println(intToRoman(943));
    }

    public static String intToRoman(int number){

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < values.length; i++ ){
            while(values[i] <= number){
                number = number - values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }


}