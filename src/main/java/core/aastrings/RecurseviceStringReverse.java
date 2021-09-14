package core.aastrings;

public class RecurseviceStringReverse {
    public static void main(String[] args) {
        RecurseviceStringReverse obj = new RecurseviceStringReverse();
        String str = "Quora";
        System.out.println("Reverse of '" + str + "' is '" + obj.reverse(str) + "'");
    }

    public String reverse(String str) {
        if ((str == null) || (str.length() <= 1))
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

}

//return reverse(str.substring(1))+str.charAt(0);