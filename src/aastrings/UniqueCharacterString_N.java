package aastrings;

public class UniqueCharacterString_N {
    private static final int NO_CHARS = 256;
    static char[] count = new char[NO_CHARS];

    public static void main(String[] args) {
        //Given String
        String str = "Unique";
        //Calculate the count of characters in the passed string
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;

        }


    }
}
