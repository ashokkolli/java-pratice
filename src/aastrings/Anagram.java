package aastrings;

public class Anagram {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String sA = "techmahindra";
        String sB = "mahindratech";
        System.out.println(isAnagram(sA, sB));

    }


    //One more approach

    public static boolean isAnagram(String first, String second) {
        first = "word";
        second = "rdow";
        char[] characters = first.toCharArray();
        StringBuilder sbSecond = new StringBuilder(second);
        for (char ch : characters) {
            int index = sbSecond.indexOf("" + ch);
            if (index != -1) {
                sbSecond.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return sbSecond.length() == 0;


    }

}
