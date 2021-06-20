package apple.strings;
import java.util.Map;
import java.util.LinkedHashMap;

public class FirstUniqueCharInString {

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else
                map.put(ch, 1);
        }


        for(Map.Entry<Character, Integer> entryset : map.entrySet()){
            if(entryset.getValue() == 1){

                return s.indexOf(entryset.getKey());
            }

        }

        return -1;
    }
}
