package core.practiceStrings;

public class PatternSearching {
    public static void main(String[] args) {
        String txt = "THIS IS A TEST TEXT";
        String pat = "TEST";
        int ind = pattSearch(txt, pat);
        System.out.println(ind);

    }

    public static int pattSearch(String txt, String pat) {
        int tLen = txt.length();
        int pLen = pat.length();
        System.out.println(tLen);
        System.out.println(pLen);
        int i;
        for (i = 0; i <= tLen - pLen; i++) {
            int j;
            for (j = 0; j < pLen; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }

            }
            if (j == pLen) {
                return i;
            }


        }

        return -1;
    }
}
