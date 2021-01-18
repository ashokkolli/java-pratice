package aastrings.practice;

public class URLifyingString {

    public static String urlify(String str) {
        return str.trim().replaceAll("\\s", "%20");
    }

    public static void main(String[] args) {
        System.out.println(urlify("What is Covid-19? "));

    }
}
