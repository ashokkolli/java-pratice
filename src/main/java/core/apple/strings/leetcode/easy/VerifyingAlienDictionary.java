package core.apple.strings.leetcode.easy;

public class VerifyingAlienDictionary {
    public static void main(String[] args) {
       String[] words = {"hello","leetcode"};
       String order = "hlabcdefgijkmnopqrstuvwxyz";
        int[] orderMap = new int[26];
        for (int i = 0; i < order.length(); i++){
            orderMap[order.charAt(i) - 'a'] = i;
            System.out.println('b' - 'a');
        }


    }
    public static boolean isSorted(String[] words, String order){
        int len = words.length;
        int orderLen = order.length();
        int[] orderMap = new int[26];
        for(int i = 0; i < orderLen; i++){
            orderMap[order.charAt(i) - 'a'] = i;
        }
        for(int i = 0; i < len - 1; i++){
            for(int j = 0; j < words[i].length(); j++){
                // If we do not find a mismatch letter between words[i] and words[i + 1],
                // we need to examine the case when words are like ("core.apple", "app").
                if( j >= words[i+1].length()) return false;
                if(words[i].charAt(j) != words[i+1].charAt(j)){
                    int currentWordChar = words[i].charAt(j) - 'a';
                    int nextWordChar = words[i+1].charAt(j) - 'a';
                    if(orderMap[currentWordChar] > orderMap[nextWordChar]) return false;
                    else break;

                }

            }
        }
        return true;
    }

}
