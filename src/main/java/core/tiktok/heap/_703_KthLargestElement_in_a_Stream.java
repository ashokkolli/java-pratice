package core.tiktok.heap;

import java.util.PriorityQueue;
//https://leetcode.com/problems/kth-largest-element-in-a-stream/solution/

public class _703_KthLargestElement_in_a_Stream {

    //Using intuitive approach you can scan through given array(Non-Sorted) and get the KthLargest in O(n) time
    //Using intuitive approach you can scan through given array(if Sorted) and get the KthLargest in O(log n) time

    //Using MinHeap - We can add/pop in O(logn) time
    //Using MinHeap - We can get min in O(1) time

  private static int k;
  private PriorityQueue<Integer> pq;
    public _703_KthLargestElement_in_a_Stream(int k, int[] nums){
        this.k = k;
        this.pq = new PriorityQueue<>(k);
        //prepare minHeap
        for(int num : nums){
            pq.offer(num);
            if(pq.size() > k)
                pq.poll();
        }
    }
    public int add(int num){
        pq.offer(num);
        if(pq.size() > k)
            pq.poll();
        return pq.peek();
    }

}
