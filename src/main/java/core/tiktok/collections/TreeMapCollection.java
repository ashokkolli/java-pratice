package core.tiktok.collections;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapCollection {

    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();
        tree_map.put(25, "Welcomes");
        tree_map.put(30, "You");
        tree_map.put(10, "Geeks");
        tree_map.put(15, "4");
        tree_map.put(20, "Geeks");

        //tree_map.
        for(Map.Entry<Integer, String> entry : tree_map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
