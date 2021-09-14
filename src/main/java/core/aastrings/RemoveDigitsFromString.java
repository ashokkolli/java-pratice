package core.aastrings;

public class RemoveDigitsFromString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "techm123techm12techm1";
        removeDigits(str);
    }

    public static void removeDigits(String str) {

        str = str.replaceAll("[0-9]", ""); //str=str.replaceAll("\\d", "");
        //str=str.replaceAll("[^A-Za-z]", "");
        System.out.println(str);


    }
}
