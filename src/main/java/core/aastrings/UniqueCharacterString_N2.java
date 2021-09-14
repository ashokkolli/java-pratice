package core.aastrings;

public class UniqueCharacterString_N2 {

    public static void main(String[] args) {
        //Given String
        String str = "Unique";
        //Take first character and compare with remaining elements


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Index is: " + i);
                break;
            }


        }
    }
}
