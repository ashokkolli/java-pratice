package core.tiktok.design;
import java.util.LinkedHashMap;
import java.util.Map;
public class LRUCache {
    private LinkedHashMap<Integer, Integer> map;
    private final int CAPACITY;

    public LRUCache(int capacity) {
        CAPACITY = capacity;
        map = new LinkedHashMap<Integer, Integer>(capacity, 0.7f, true) {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };
    }
        public int get(int key){
            return map.getOrDefault(key, -1);
        }
        public void put(int key, int value){
            map.put(key, value);
        }

    public static void main(String[] args) {


        LRUCache lruCache = new LRUCache(2);
        System.out.println(lruCache.get(2)); // -1
        lruCache.put(2, 1); // 2, 1 -
        lruCache.put(3, 2); // (2, 1), (3, 2)
        lruCache.put(4, 3); // (2, 1), (3, 2), (4, 3) --eldestRemove--> (3, 2), (4, 3)
        System.out.println(lruCache.get(2)); // -1
        for(Map.Entry<Integer, Integer> entrySet : lruCache.map.entrySet())
            System.out.println("key: "+entrySet.getKey());

        System.out.println(lruCache.get(3)); // 2 //  reorder cache-->  (4, 3), (3, 2)

        /**
         * ************ LinkedHashMap reorders itself based on last visited/get key
         **/


        for(Map.Entry<Integer, Integer> entrySet : lruCache.map.entrySet())
            System.out.println("key: "+entrySet.getKey());


        lruCache.put(5, 4); //
        System.out.println(lruCache.map.size());
        System.out.println(lruCache.get(4));

    }
}
