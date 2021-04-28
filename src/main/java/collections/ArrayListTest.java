package collections;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Ashok Kolli on 3/29/2021
 */

public class ArrayListTest {
    List<String> list = new ArrayList<>();
    List<String> list2 = new ArrayList<>();

    @Before
    public void add() {
        list.add("cat");
        list.add("dog");
        list.add("apple");
        list.add("bat");
        System.out.println(list);
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");
        System.out.println(list);
    }

    @Test
    public void search() {
        System.out.println(list.contains("cat"));
    }

    @Test
    public void sort() {
        Collections.sort(list);
        System.out.println(list);
    }

    @Test
    public void copyList() {

        Collections.copy(list2, list);
        System.out.println(list2);
    }

    @Test
    public void reverse() {
        Collections.reverse(list2);
        System.out.println(list2);
    }

    @Test
    public void remove() {
        list.remove(1);

    }

    @Test
    public void set() {
        list.set(1, "Setting");
        System.out.println(list);
    }

    @Test
    public void sublist() {
        System.out.println(list2.subList(0, 2));
    }

    @Test
    public void swap() {
        Collections.swap(list2, 0, 1);
        System.out.println(list2);
    }

    @Test
    public void convertArrayToList() {
        Integer[] arr = {1, 2, 3, 4};
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, arr);
        System.out.println(list);
    }
}
