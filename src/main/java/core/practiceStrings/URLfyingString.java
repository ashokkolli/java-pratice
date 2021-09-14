package core.practiceStrings;

public class URLfyingString {
    public static void main(String[] args) {
        String str = "abc   abc abc  ";
        String url = uRLfying(str);
        System.out.println(url);

        url = uRLfyingWithReplaceAll(str);
        System.out.println(url);
    }

    public static String uRLfying(String str) {
        str = str.trim();
        String[] strArr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i]);
            if (i != strArr.length - 1)
                sb.append("%20");
        }
        return sb.toString();
    }

    public static String uRLfyingWithReplaceAll(String str) {
        str = str.trim();
        str = str.replaceAll("\\s", "%20");
        return str;
    }
}
