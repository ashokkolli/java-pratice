package core.tiktok.linkedlist;

public class DetectAndRemoveLoop {
    static Node head;

    public static void main(String[] args) {
        DetectAndRemoveLoop drl = new DetectAndRemoveLoop();
        //Creating Nodes;
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        //Creating a loop
        head.next.next.next.next.next.next = head.next.next;
    }

    public static void detectAndRemoveLoop(Node node) {
        Node slow = node, fast = node;
        Node start;
        //If fast.next is null, then there is no loop
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                //removeLoop(slow, node);
                break;
            }

        }
        fast = head;
        while (slow != head) {
            slow = slow.next;
            fast = fast.next;
        }
        start = slow;
    }

    public static void removeLoop(Node slow, Node curr) {
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

