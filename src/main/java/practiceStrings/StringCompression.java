package practiceStrings;

public class StringCompression {
    public static void main(String[] args) {
        String str = "AAABBAACCaa";
        str = stringCompression(str);
        System.out.println(str);
    }

    public static String stringCompression(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char prevCh = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (prevCh == str.charAt(i)) {
                count++;
            } else {
                sb.append(prevCh).append(count);
                count = 1;
            }
            prevCh = str.charAt(i);

        }
        return sb.append(prevCh).append(count).toString();
    }
}
