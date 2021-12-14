//Operations on Min Heap:
//        1) getMini(): It returns the root element of Min Heap. Time Complexity of this operation is O(1).
//
//        2) extractMin(): Removes the minimum element from MinHeap. Time Complexity of this Operation is O(Logn) as this operation needs to maintain the heap property (by calling heapify()) after removing root.
//
//        3) decreaseKey(): Decreases value of key. The time complexity of this operation is O(Logn). If the decreases key value of a node is greater than the parent of the node, then we don’t need to do anything. Otherwise, we need to traverse up to fix the violated heap property.
//
//        4) insert(): Inserting a new key takes O(Logn) time. We add a new key at the end of the core.tree. IF new key is greater than its parent, then we don’t need to do anything. Otherwise, we need to traverse up to fix the violated heap property.
//
//        5) delete(): Deleting a key also takes O(Logn) time. We replace the key to be deleted with minum infinite by calling decreaseKey(). After decreaseKey(), the minus infinite value must reach root, so we call extractMin() to remove the key.


package core.tiktok.heap;

import java.util.PriorityQueue;

public class _215_KthLargestElement_in_an_Array {


    //https://stackoverflow.com/questions/30072077/priority-queue-ordering-of-elements
    //https://leetcode.com/problems/kth-largest-element-in-an-array/solution/

/*
*
* The time complexity of adding an element in a heap of size k is \mathcal{O}(\log k)O(logk),
* and we do it N times that means \mathcal{O}(N \log k)O(Nlogk) time complexity for the algorithm.
*
* */
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 0};
        int k = 2;

     /*   PriorityQueue<Integer> pr = new PriorityQueue<Integer>(k);
        for(int ele : arr) {
            pr.add(ele);
            System.out.println(pr);
        }
*/

        PriorityQueue<Integer> pr = kLargest(arr, k);
        for (int i = 0; i < k; i++) {
            System.out.println(pr.poll());
        }
    }

    static PriorityQueue<Integer> kLargest(int[] arr, int k) {
        PriorityQueue<Integer> pr = new PriorityQueue<Integer>(k);
        for (int ele : arr) {
            pr.add(ele);
            if (pr.size() > k)
                pr.poll();
        }
        return pr;

    }
}
