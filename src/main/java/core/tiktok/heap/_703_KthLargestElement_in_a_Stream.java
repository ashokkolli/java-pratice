package core.tiktok.heap;

import java.util.PriorityQueue;
//https://leetcode.com/problems/kth-largest-element-in-a-stream/solution/

public class _703_KthLargestElement_in_a_Stream {

    int k;
    PriorityQueue<Integer> priorityQueue;
    public _703_KthLargestElement_in_a_Stream(int k, int[] num){
        priorityQueue = new PriorityQueue<>();

        this.k = k;
        for(int n : num)
            priorityQueue.offer(n);

       while(priorityQueue.size() > k)
           priorityQueue.poll();
    }

    public int add(int x){
        priorityQueue.offer(x);
        if(priorityQueue.size() > k){
            priorityQueue.poll();
        }

        return priorityQueue.peek();
    }

}
