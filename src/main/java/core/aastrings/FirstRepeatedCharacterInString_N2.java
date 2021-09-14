package core.aastrings;

class FirstRepeatedCharacterInString_N2 {

    static int firstRepeatedCharacterInString(String s) {

        // this is O(N^2) method
        int p = -1, i, j;
        for (i = 0; i < s.length(); i++) {
            for (j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    p = i;
                    break;
                }
            }
            if (p != -1)
                break;
        }

        return p;
    }

    // Driver code
    static public void main(String[] args) {
        String str = "geeksforgeeks";
        int pos = firstRepeatedCharacterInString(str);

        if (pos == -1)
            System.out.println("Not found");
        else
            System.out.println(str.charAt(pos));
    }
}

//This code is contributed by anuj_67. 
//public class FirstRepeatedCharacterInString_N2 {
//
//}
