package core.imp.linkedlist;

public class PairWiseSwapLinks {

    static Node head;

    // Driver program to test above functions
    public static void main(String[] args) {

		/* The constructed linked list is:
		1->2->3->4->5->6->7 */
        PairWiseSwapLinks list = new PairWiseSwapLinks();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        System.out.println("Linked list before calling pairwiseSwap() ");
        list.printList(head);
        Node st = list.pairWiseSwap(head);
        System.out.println();
        System.out.println("Linked list after calling pairwiseSwap() ");
        list.printList(st);
        System.out.println();

    }

    /* Function to pairwise swap elements of a linked list */
    Node pairWiseSwap(Node node) {

        // If linked list is empty or there is only one node in list
        if (node == null || node.next == null) {
            return node;
        }

        // Initialize previous and current pointers
        Node prev = node;
        Node curr = node.next;

        node = curr; // Change head before proceeeding

        // Traverse the list
        while (true) {
            Node next = curr.next;
            curr.next = prev; // Change next of current as previous node

            // If next NULL or next is the last node
            if (next == null || next.next == null) {
                prev.next = next;
                break;
            }

            // Change next of previous to next next
            prev.next = next.next;

            // Update previous and curr
            prev = next;
            curr = prev.next;
        }
        return node;
    }

    /* Function to print nodes in a given linked list */
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}

// This code has been contributed by Mayank Jaiswal

