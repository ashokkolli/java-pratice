package array;


import java.util.HashMap;
import java.util.Map;

/**
 * @author Abhinaw.Tripathi
 */
public class FrequentWordInArrayOfStrings_O_n {
    public static void main(String[] args) {
        String[] votes = {"Abhinaw", "Gaurav", "Abhishek",
                "Garima", "babli", "Logesh",
                "Lalitha", "Pawan", "Abhinaw",
                "Abhinaw", "Garima", "Abhinaw",
                "Abhinaw"};

        findWinner(votes);
    }

    public static void findWinner(String[] votes) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : votes) {
            if (map.containsKey(str))
                map.put(str, map.get(str) + 1);
            else
                map.put(str, 1);
        }
        int maxValueInMap = 0;
        String winner = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            if (val > maxValueInMap) {
                maxValueInMap = val;
                winner = key;
            }

            // If there is a tie, pick the
            else if (val == maxValueInMap && winner.compareTo(key) > 0)
                winner = key;
        }
        System.out.println("Winning Candidate is :" + winner);
    }

}