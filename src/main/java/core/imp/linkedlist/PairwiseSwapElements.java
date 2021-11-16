//https://www.geeksforgeeks.org/pairwise-swap-elements-of-a-given-linked-list/

package core.imp.linkedlist;

public class PairwiseSwapElements {
    // Java program to pairwise swap elements of a linked list

    Node head; // head of list
    Node last;

    /* Driver program to test above functions */
    public static void main(String[] args) {
        PairwiseSwapElements llist = new PairwiseSwapElements();

        /* Created Linked List 1->2->3->4->5 */

        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);
        llist.push(6);


        System.out.println("Linked List before calling pairWiseSwap() ");
        llist.printList();

        llist.pairWiseSwap();

        System.out.println("Linked List after calling pairWiseSwap() ");
        llist.printList();
    }

    void pairWiseSwap() {
        Node temp = head;

        /* Traverse only till there are atleast 2 nodes left */
        while (temp != null && temp.next != null) {

            /* Swap the data */
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }


    /* Utility functions */

    /* Inserts a new Node at front of the list. */

    //ITS MY OWN CODE TO PUSH
    public void push(int new_data) {
		/* 1 & 2: Allocate the Node &
				Put in the data*/
        Node new_node = new Node(new_data);
        if (head == null)
            head = new_node;
        else
            last.next = new_node;

        /* 3. Make next of new Node as head */
        last = new_node;

        /* 4. Move the head to point to new Node */
    }

    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Linked list Node*/
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
/* This code is contributed by Rajat Mishra */

