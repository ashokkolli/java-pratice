package core.tiktok.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _MinPriorityQueueToMaxPriorityQueue {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 0};
        int k = 2;
        //Comparator.reverseOrder()
        PriorityQueue<Integer> pr = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for (int ele : arr) {
            pr.offer(ele);
            System.out.println(pr);
        }

    }


}