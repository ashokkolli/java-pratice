package stack.practice_1;

/**
 * Created by Ashok Kolli on 6/23/2020
 */

public class StackWithArray {

    private static final int size = 5;
    private static final int[] stackArr = new int[size];
    private static int top = -1;

    public static boolean isEmpty() {
        return top == size - 1;
    }

    public static int push(int x) {
        if (isEmpty()) {
            System.out.println("Stack Overflow");
            return -1;
        } else {
            top++;
            stackArr[top] = x;
            return x;
        }

    }

    public static int peek() {
        if (top == -1) {
            System.out.println("stack is underflow");
            return -1;
        } else {
            int pop = stackArr[top];
            return pop;
        }
    }

    public static boolean search(int x) {
        for (int i : stackArr) {
            if (x == i) {
                return true;
            }
        }
        return false;

    }

    public static int pop() {
        if (top == -1) {
            System.out.println("stack is underflow");
            return -1;
        } else {
            int pop = stackArr[top];
            top--;
            return pop;
        }
    }

    public static void main(String[] args) {

        System.out.println(push(1));
        System.out.println(push(2));
        System.out.println(push(3));
        System.out.println(push(4));
        System.out.println(push(5));
        System.out.println(push(5));

        System.out.println(peek());

        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());


    }
}
