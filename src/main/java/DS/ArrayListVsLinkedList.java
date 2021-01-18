package DS;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<String> al = new ArrayList<String>();
        al.add("AL 1");
        al.add("AL 2");
        al.add("AL 3");
        al.remove("AL 2");
        System.out.println(al.contains("AL 2"));
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("LL 1");
        ll.add("LL 2");
        ll.add("LL 3");
        ll.remove("LL 2");
        System.out.println(ll.contains("LL 3"));


    }

}
