package core.tiktok.strings;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ashok Kolli on 5/18/2021
 */

public class PatternSearching {

    public static void main(String[] args) {

        String text = "TechabTechabTech";
        String patt = "Tech";
        patt(text, patt);
    }

    public static List<Integer> patt(String text, String patt) {
        int textLen = text.length();
        int pattLen = patt.length();
        List<Integer> listInd = new LinkedList<>();

        for (int i = 0; i <= (textLen - pattLen); i++) {
            int count = 0;
            for (int j = 0; j < pattLen; j++) {
                if (patt.charAt(j) == text.charAt(j + i)) {
                    count++;
                } else
                    break;
            }
            if (count == pattLen)
                listInd.add(i);

        }
        System.out.println(listInd);
        return listInd;
    }


    public static List<Integer> patt1(String text, String patt) {
        int textLen = text.length();
        int pattLen = patt.length();
        List<Integer> listInd = new LinkedList<>();

        for (int i = 0; i <= (textLen - pattLen); i++) {
            int j;
            for (j = 0; j < pattLen; j++) {
                if (patt.charAt(j) != text.charAt(j + i)) {
                    break;
                }
            }
            if (j == pattLen)
                listInd.add(i);

        }
        System.out.println(listInd);
        return listInd;
    }
}
