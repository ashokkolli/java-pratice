//https://www.youtube.com/watch?v=yMJLpdKV0BQ
//Pattern Matching Algorithm - Brute Force

package aastrings;

import java.util.ArrayList;
import java.util.List;

public class PatternMatchingAlogBruteForce {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String txt = "ACAAD AABAA";
        String ptr = "AABA";
        List<Integer> result = patternMatching(txt, ptr);
        for (Integer ele : result)
            System.out.println("matching found at" + ele);
//		if (result != -1)
//			System.out.println("matching found at" + result);
//		else
//			System.out.println("matching not found");

    }

    public static List<Integer> patternMatching(String txt, String ptr) {
        List<Integer> result = new ArrayList<>();
        int LN = txt.length();
        int LP = ptr.length();
        int MAX = LN - LP;
        int j;
        for (int i = 0; i < MAX; i++) {
            for (j = 0; j < LP; j++) {
                if (ptr.charAt(j) != txt.charAt(i + j))
                    break;
            }
            if (j == LP) {
                ///System.out.println("matching found at" +i);
                result.add(i);

            }
        }
        return result;
    }

}
