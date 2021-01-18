package aastrings.practice;

import java.util.Scanner;

/**
 * Created by Ashok Kolli on 7/18/2020
 */

public class FindSubString {

    public static int findSubString(String str) {
        String substr = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j <= str.length() - i; j++) {
                System.out.println(str.substring(i, i + j));
                String match = findMatch(str.substring(i, i + j));
                System.out.println(match);
                if (!match.equals("null")) {
                    substr = match;
                    count++;
                }
            }
        }
        return count;
    }

    public static String findMatch(String str) {
        if (str.charAt(0) == str.length() - 1) {
            return str;
        } else return "null";
    }

    public static void main(String[] args) {
        int numberOfQueries = 0;
        System.out.println("Enter length of the string and Number of Queries ");
        Scanner scanner = new Scanner(System.in);
        String length_queries = scanner.nextLine();
        System.out.println("length of the string and Number of Queries :" + length_queries);

        numberOfQueries = Integer.parseInt(length_queries.split("  ")[1]);
        String[] queries = new String[numberOfQueries];

        System.out.println("Enter text ");
        scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("text :" + text);

        for (int i = 0; i < numberOfQueries; i++) {
            System.out.println("Enter Queries ");
            scanner = new Scanner(System.in);
            queries[i] = scanner.nextLine();
            int startQueryIndex = Integer.parseInt(queries[i].split("  ")[0]);
            int endQueryIndex = Integer.parseInt(queries[i].split("  ")[1]);
            if (startQueryIndex > endQueryIndex) {
                System.out.println("Starting index shouldn't be greater than end index");
                System.out.println("please try agian");
                queries[i] = scanner.nextLine();
            }
            if (endQueryIndex > text.length()) {
                System.out.println("Given String length is only" + text.length() + "" +
                        "please give <=" + text.length());
                System.out.println("please try agian");
                queries[i] = scanner.nextLine();
            }
        }

        for (int j = 0; j < numberOfQueries; j++) {
            int startQueryIndex = Integer.parseInt(queries[j].split("  ")[0]);
            int endQueryIndex = Integer.parseInt(queries[j].split("  ")[1]);

            int count = findSubString(text.substring(startQueryIndex, endQueryIndex));
            System.out.println(count);
        }

    }
}
