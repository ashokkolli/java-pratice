package core.imp.strings;

import java.util.*;

/**
 * Created by Ashok Kolli on 5/14/2021
 */

public class FindAnagramsList {
    public static void main(String[] args) {

        // Driver program
        String[] arr = {"cat", "dog", "tac", "god", "act"};
        List<List<String>> listOfAnagramGroups = groupAnagrams(arr);
        System.out.println(listOfAnagramGroups);
    }

    public static List<List<String>> groupAnagrams(String[] arr) {
        Map<String, List<String>> map = new LinkedHashMap<>();
        List<List<String>> listOfLists = new LinkedList<>();
        //Sort each String from string core.array and add the
        for (int i = 0; i < arr.length; i++) {
            char[] tempArr = arr[i].toCharArray();
            Arrays.sort(tempArr);
            List<String> tempList = new LinkedList<>();
            if (map.containsKey(String.valueOf(tempArr))) {
                tempList = map.get(String.valueOf(tempArr));
            }
            tempList.add(arr[i]);
            map.put(String.valueOf(tempArr), tempList);
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            listOfLists.add(entry.getValue());
        }

        return listOfLists;

    }

}
