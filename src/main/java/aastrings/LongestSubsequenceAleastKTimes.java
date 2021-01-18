package aastrings;

public class LongestSubsequenceAleastKTimes {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String inStr = "geeksforgeeks";
        int k = 2;
        int count = 0;
        char[] charArr = inStr.toCharArray();
        int len = charArr.length;
        char[] temp = new char[len];
        int j = 1;
        for (int i = 0; i < len; i++) {
            for (j = 1; j < charArr.length; j++) {
                if (charArr[i] == charArr[j])
                    count++;
            }
            if (count >= k) {
                temp[i] = charArr[j];
                System.out.println(temp[i]);
            }
        }

        for (int i = 0; i < temp.length; i++)
            System.out.print(temp[i]);
    }

}
