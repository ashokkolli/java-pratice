package aastrings.practice;

public class PatternSearching {

    public static int patternSearching(String text, String patt) {
        //Check if String are null;
       /* if(text == null | patt==null)
            return -1;
        if(text.length() ==0 || patt.length() ==0)
            return -1;*/
        text = text.trim();
        patt = patt.trim();
        int LN = text.length();
        int LP = patt.length();
        int diff = LN - LP;
        for (int i = 0; i < diff; i++) {
            System.out.println("i :" + i);
            int j;
            for (j = 0; j < LP; j++) {
                if (patt.charAt(j) != text.charAt(i + j))
                    break;
            }
            System.out.println(j);
            if (j == LP) {
                System.out.println("yayy");
            }
        }


        return 0;
    }

    public static void main(String[] args) {
        String text = "TechMahindraisthebest";
        String patt = "best";
        patternSearching(text, patt);
    }

}
