package aastrings.practice;

public class Compression {
    public static String compressString(String string) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char[] charr = string.toCharArray();
        char prev = charr[0];//prev = a
        for (int i = 1; i < charr.length; i++) {
            if (charr[i] == prev) { //b== a
                count++; // count=2
            } else {
                sb.append(prev); //sb= a
                sb.append(count);//sb = a2
                count = 1;
            }
            prev = charr[i];//prev= a

        }
        sb.append(prev); //sb= a
        sb.append(count);
        //   StringBuilder sb = new StringBuilder();

        System.out.println(sb.toString());
        return sb.toString();
    }


    public static void main(String[] args) {
        compressString("aabbccsdfsfsddafssdafsdfass");

    }
}
