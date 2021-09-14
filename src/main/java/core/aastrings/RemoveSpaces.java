package core.aastrings;

public class RemoveSpaces {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "g eeks for ge eeks ";
        removeSpaces1(str);
        removeSpaces2(str);
        removeSpaces3(str);

    }

    //Remove spaces -1
    public static void removeSpaces1(String str) {
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                str1.append(str.charAt(i));
        }
        System.out.println(str1);
    }

    //Remove spaces -2
    public static void removeSpaces2(String str) {
        System.out.println(str.replaceAll("\\s", ""));
    }

    //Remove spaces -3
    public static void removeSpaces3(String str) {
        int count = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                arr[count] = str.charAt(i);
                count++;
            }
            arr[count] = '\0';
        }
        for (int i = 0; i < count; i++)
            System.out.print(arr[i]);
    }
}
