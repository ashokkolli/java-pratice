package aastrings;

import java.util.LinkedHashSet;

public class UnionOfStrings {

    public static void main(String[] args) {
        String s1 = "String";
        String s2 = "Strong";
        String unionString = unionOfStrings(s1, s2);
        System.out.println(unionString);
    }

    static String unionOfStrings(String s1, String s2) {
        StringBuffer sb = new StringBuffer();
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for (int i = 0; i < s1.length(); i++)
            hs.add(s1.charAt(i));
        for (int i = 0; i < s2.length(); i++) {
            if (hs.contains(s2.charAt(i)))
                sb.append(s2.charAt(i));
        }

        return sb.toString();

    }


}
