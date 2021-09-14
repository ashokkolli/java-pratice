package core.aastrings.practice;

public class ReverseWords {

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reverseWords = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String temp = new StringBuilder(words[i]).reverse().toString();
            reverseWords.append(temp).append(" ");
        }
        System.out.println(reverseWords.toString().trim());
        return reverseWords.toString();
    }

    public static void main(String[] args) {
        reverseWords("Reverse words in a String ");

    }
}


