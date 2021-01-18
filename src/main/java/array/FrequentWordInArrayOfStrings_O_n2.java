package array;

public class FrequentWordInArrayOfStrings_O_n2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String[] arr = {"geeks", "for", "geeks", "a",
                "portal", "to", "learn", "can",
                "be", "computer", "science",
                "zoom", "yup", "fire", "in",
                "be", "data"};
        String[] fs = frequentWord(arr);
        for (String str : fs)
            System.out.println(str);

    }

    public static String[] frequentWord(String[] arr) {

        int len = arr.length;
        int count = 0;
        String[] fs = new String[len / 2];
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i].equals(arr[j])) {
                    //System.out.println(arr[i]+ "  "arr[j]);
                    fs[count] = arr[i];
                    count++;
                    break;
                }
            }
        }

        return fs;
    }

}
