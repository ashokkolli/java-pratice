package core.aastrings;

public class StringCompression {
    public static void main(String[] args) {
        String str = "AAABBBCCCDAAA";
        String compressedString = stringCompression(str);
        System.out.println(compressedString);
    }

    static String stringCompression(String str) {
        //A3B3C3D1A3;

        if (str.isEmpty()) {
            return "";
        }

        char[] chars = str.toCharArray();
        StringBuilder builder = new StringBuilder();

        int count = 1;
        char prev = chars[0];
        for (int i = 1; i < chars.length; i++) {
            char current = chars[i];
            if (current == prev) {
                count++;
            } else {
                builder.append(prev).append(count);
                count = 1;
            }
            prev = current;
        }
        return builder.append(prev).append(count).toString();

//        LinkedHashMap<Character, Integer> lhs = new LinkedHashMap<>();
//        for(int i=0;i<str.length();i++){
//            if(lhs.containsKey(str.charAt(i))) {
//                lhs.put(str.charAt(i), lhs.get(str.charAt(i)) + 1);
//            }else
//                lhs.put(str.charAt(i), 1);
//
//        }
//        StringBuilder sb = new StringBuilder();
//        for(Map.Entry<Character, Integer> entry : lhs.entrySet() ){
//            sb.append(entry.getKey());
//            sb.append(entry.getValue());
//        }
//        return sb.toString();
//    }

    }
}