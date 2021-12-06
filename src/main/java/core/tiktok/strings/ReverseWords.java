package core.tiktok.strings;

import java.util.*;

/**
 * Created by Ashok Kolli on 5/13/2021
 */

public class ReverseWords {

    public static void main(String[] args) {
        String str = " Reverse Words in a String ";
        System.out.println(str.length());
        str =  reverseWords_Optimized_Deque(str);
        System.out.println(str);
        System.out.println(str.length());

    }



    public static String reverseWords_BT2(String str) {
        String[] strArr = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length - 1; i >= 0; i--) {
            sb.append(strArr[i]);
            if (i > 0)
                sb.append(" ");
        }
      return sb.toString();
    }

    public static String reverseWords_BT1(String str){
        List<String> wordList = Arrays.asList(str.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);

    }

   public static String reverseWords_Optimized_Deque(String str){
        int left = 0;
        int right = str.length() - 1;
        //Remove leading spaces
       while(left <= right && str.charAt(left) == ' ' ){
           left++;
       }
       //Remove trailing spaces
       while(left <= right && str.charAt(right) == ' '){
           right--;
       }

       Deque<String> deque = new ArrayDeque<>();
       StringBuilder sb = new StringBuilder();
       //Push word by word in front of deque
       while(left <= right){
           char ch = str.charAt(left);
           if((sb.length() != 0) && ch == ' '){
               //add to head
               deque.offerFirst(sb.toString());
               sb.setLength(0);
           }else {
               sb.append(ch);
           }
           left++;
       }
       deque.offerFirst(sb.toString());
       return String.join(" ", deque);
   }

}
