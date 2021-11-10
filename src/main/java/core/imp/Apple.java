package core.imp;


/**
 * Created by Ashok Kolli on 4/4/2021
 */

public class Apple {

    public static void main(String[] args) {

        String str = "  leetecode is awesome";
        int l = 0;
        int r = str.length() - 1;
        while(l<=r && str.charAt(l) == ' ')
            l++;
        System.out.println(l);
    }
}
