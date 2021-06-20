package apple.arrays;


import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubString {
    public static void bf(){
        String str = "abbcacd";
        int start = 0;
        int maxLen = 0;
        for(int i = 0; i < str.length() ; i++){
            for(int j = i+1; j < str.length(); j++){
                char chi = str.charAt(i);
                char chj = str.charAt(j);
                if(chi == chj){
                    start = i+1;
                }else{
                    maxLen = i - start +1 ;
                }
            }
        }
        System.out.println(maxLen);


    }

    public static void main(String[] args) {
        bf();
      /*  String str = "aabba";
        Map<Character, Integer> hashMap = new LinkedHashMap<>();
        int j = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hashMap.containsKey(ch)) {
                j = Math.max(j, hashMap.get(ch) + 1);
            }
            hashMap.put(ch, i);
            max = Math.max(max, i - j + 1);
        }
        System.out.println(max);*/
    }
}
