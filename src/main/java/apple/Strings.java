package apple;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by Ashok Kolli on 4/4/2021
 */

public class Strings {

    public static void main(String[] args) {

        String str = "  leetecode is awesome";
        int l = 0;
        int r = str.length() - 1;
        while(l<=r && str.charAt(l) == ' ')
            l++;
        System.out.println(l);
    }
}
