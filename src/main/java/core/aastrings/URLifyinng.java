package core.aastrings;

public class URLifyinng {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "I am a good boy";
        int len = str.length();
        urlify(str, len);
    }

    public static void urlify(String str, int len) {
        //Convert to Char Array
        char[] arr = str.toCharArray();
        //find spacecount
        int spaceCount = 0;
        for (int i = 0; i < len; i++)
            if (arr[i] == ' ')
                spaceCount++;
        int newLen = len + 2 * spaceCount;
        char[] newArr = new char[newLen];
        for (int i = len - 1; i >= 0; i--) {
            if (arr[i] == ' ') {
                newArr[newLen - 1] = '0';
                newArr[newLen - 2] = '2';
                newArr[newLen - 3] = '%';
                newLen = newLen - 3;
            } else {
                newArr[newLen - 1] = arr[i];
                newLen = newLen - 1;
            }
        }
        System.out.println(String.valueOf(newArr));
    }

}
