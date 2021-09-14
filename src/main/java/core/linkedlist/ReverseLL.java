package core.linkedlist;
//https://www.geeksforgeeks.org/reverse-a-linked-list/

public class ReverseLL {
    static Node head;

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {

        ReverseLL rll = new ReverseLL();
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println("Given Linked List");
        printList(head);
        head = rll.reverseList(head);
        System.out.println("Reversed Linked List");
        printList(head);


    }

    Node reverseList(Node node) {
//Initialize three pointers prev as NULL, curr as head and next as NULL.
        Node prev = null;
        Node curr = node;//Head
        Node next = null;
        while (curr != null) {
            //Store next node
            next = curr.next;
            //Now change next of current
            //This is where actual reversing happens
            curr.next = prev;
            //move prev and curr nodes by one
            prev = curr;
            curr = next;
        }
        //As Curr and Next already representig null;
        node = prev;
        return node;
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
