package core.tiktok.heap;

import java.util.*;

public class _347_TopKFrequentElements {

    public static void main(String[] args) {
        topKFrequent(new int[]{1,1,1,2,2,3}, 2);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        // O(1) time
        if (k == nums.length) {
            return nums;
        }

        // 1. build hash map : character and how often it appears
        // O(N) time
        Map<Integer, Integer> count_map = new HashMap();
        for (int n: nums) {
            count_map.put(n, count_map.getOrDefault(n, 0) + 1);
        }

        // init heap 'the less frequent element first'
        Queue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return count_map.get(n1) - count_map.get(n2);
            }
        });


        // 2. keep k top frequent elements in the heap
        // O(N log k) < O(N log N) time
        for (int n: count_map.keySet()) {
            heap.add(n);
            if (heap.size() > k) heap.poll();
        }

        System.out.println(count_map.keySet());
        // 3. build an output array
        // O(k log k) time

        // you need to traverse from the end, as it is sorted with less frequent element
        int[] top = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            top[i] = heap.poll();
        }

        return top;
    }

    public static void frequentElements(int[] arr, int k){

        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
        }
        Queue<Integer> pq = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));
        for(int n : map.keySet()){
            pq.add(n);
            if(pq.size() > k)
                pq.poll();
        }

        // 3. Build an output array
        int[] top = new int[k];
        for(int i = k-1;  i >= 0 ; --i){
            top[i] = pq.poll();
        }
    }


}
