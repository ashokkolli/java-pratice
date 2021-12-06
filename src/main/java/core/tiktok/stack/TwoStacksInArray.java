package core.tiktok.stack;

public class TwoStacksInArray {

    // Java program to implement two stacks in a
// single core.array

    int size;
    int top1, top2;
    int[] arr;

    // Constructor
    TwoStacksInArray(int n) {
        arr = new int[n];
        size = n;
        top1 = -1;
        top2 = size;
    }

    // Driver program to test twoStack class
    public static void main(String[] args) {
        TwoStacksInArray ts = new TwoStacksInArray(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from" +
                " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from" +
                " stack2 is " + ts.pop2());
    }

    // Method to push an element x to stack1
    void push1(int x) {
        // There is at least one empty space for
        // new element
        if (top1 < top2 - 1) {

            arr[++top1] = x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    // Method to push an element x to stack2
    void push2(int x) {
        // There is at least one empty space for
        // new element
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    // Method to pop an element from first core.imp.stack
    int pop1() {
        if (top1 == -1) {
            System.out.println("Stack Underflow");
            System.exit(1);
        } else {
            return arr[top1--];
        }
        return 0;
    }

    // Method to pop an element from second core.imp.stack
    int pop2() {
        if (top2 == size) {
            System.out.println("Stack Underflow");
            System.exit(1);
        } else {
            return arr[top2++];
        }
        return 0;
    }
}

// This code has been contributed by
// Amit Khandelwal(Amit Khandelwal 1).

