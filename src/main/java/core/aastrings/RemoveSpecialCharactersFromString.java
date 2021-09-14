package core.aastrings;

public class RemoveSpecialCharactersFromString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "tec$%^&*hm123tec$%^&*hm12tec1241344hm1$%^";
        removeDigits(str);
    }

    public static void removeDigits(String str) {

        str = str.replaceAll("[\\W_]", "");
        //if you want to remove all the Characters and Digits and only to display special Characters
        //str=str.replaceAll("[^\\W_]", "");

        System.out.println(str);

    }
}
