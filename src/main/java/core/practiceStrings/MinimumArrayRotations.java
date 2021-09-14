package core.practiceStrings;

public class MinimumArrayRotations {

    public static int miniumRotations(String str) {
        int len = str.length();
        StringBuilder sb = new StringBuilder(str);
        sb.append(str);
        for (int i = 1; i <= len; i++) {
            String temp = sb.substring(i, i + len);
            System.out.println(temp);
            if (temp.equals(str))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "abcd";
        int i = miniumRotations(str);
        System.out.println(i);
    }

}
