package stack;

import static java.lang.System.exit;

public class StackWithLinkedList {
    Node top;

    public static void main(String[] args) {
        // create Object of Implementing class
        StackWithLinkedList obj = new StackWithLinkedList();
        // insert Stack value
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

        // print Stack elements
        obj.display();

        // pritn Top element of Stack
        System.out.printf("\nTop element is %d\n", obj.peek());

        // Delete top element of Stack
        System.out.println("popped : " + obj.pop());
        System.out.println("popped : " + obj.pop());


        // pritn Stack elements
        obj.display();

        // print Top element of Stack
        System.out.printf("\nTop element is %d\n", obj.peek());
    }
    // create globle top reference variable
    // Constructor

    // Utility function to add an element x in the stack
    public void push(int x) // insert at the beginning
    {
        // create new node temp and allocate memory
        Node newNode = new Node(x);

        // check if stack (heap) is full. Then inserting an
        // element would lead to stack overflow
        if (newNode == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        // put top reference into temp link
        newNode.next = top;

        // update top reference
        top = newNode;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return top == null;
    }

    // Utility function to return top element in a stack
    public int peek() {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // Utility function to pop top element from the stack
    public int pop() // remove at the beginning
    {
        Node tempNode;
        int topData;
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return -1;
        }
        tempNode = top.next;
        topData = top.data;
        top.next = null;
        top = tempNode;
        return topData;
    }

    public void display() {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        } else {
            Node temp = top;
            while (temp != null) {

                // print node data
                System.out.printf("%d->", temp.data);

                // assign temp link to temp
                temp = temp.next;
            }
        }
    }

    // A linked list node
    public static class Node {

        int data; // integer data
        Node next; // reference variavle Node type

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
}

