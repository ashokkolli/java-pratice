package datastrucutres;

import java.util.*;
import java.util.Map.Entry;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        //Default Capacity is 16
        //Default Load Factor 0.75
        hm.put(1, "Selenium");
        hm.put(2, "Appium");
        hm.put(3, "Espresso");
        hm.put(4, "Mobly");
        System.out.println(hm);
        System.out.println(hm.put(1, "Robot Framework"));
        //KeySet
        Set<Integer> set = hm.keySet();//Set is collection object so output of below statment is Collection Object like []
        System.out.println(set);//[k,k,k]
        //Values
        Collection<String> c = hm.values();
        System.out.println(c);
        //EntrySet
        Set<Entry<Integer, String>> set1 = hm.entrySet();
        System.out.println(set1);
        //One  way of iterating
        for (Entry<Integer, String> e : set1) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        System.out.println();
        //Another way of iterating
        Iterator<Entry<Integer, String>> itr = set1.iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, String> e = itr.next();

            System.out.println(e.getKey() + " : " + e.getValue());
            if (e.getValue().equals("Robot Framework")) {
                e.setValue("Selenium");
                System.out.println(e.getKey() + " : " + e.getValue());
            }
        }

//	HashMap<Integer, Employee> hm1=new HashMap<Integer, Employee>();

    }
}
