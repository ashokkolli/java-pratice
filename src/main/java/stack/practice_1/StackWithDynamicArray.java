package stack.practice_1;

/**
 * Created by Ashok Kolli on 6/24/2020
 */

public class StackWithDynamicArray {


    private static int SIZE = 2;
    private static int[] stackArr = new int[SIZE];


    private static int top = -1;

    public static boolean isEmpty() {
        return top == -1;
    }

    public static boolean isFull() {
        return top == SIZE - 1;
    }

    private static void expand() {
        SIZE = SIZE + 2;
        int[] dStackArr = new int[SIZE];
        System.arraycopy(stackArr, 0, dStackArr, 0, stackArr.length);
        stackArr = dStackArr;


    }
   /* private static void expand() {
        SIZE = SIZE+2;
        int[] dStackArr  = new int[SIZE];
        System.arraycopy(stackArr,0,dStackArr,0,stackArr.length);
        stackArr = dStackArr;


    }*/

    public static int push(int x) {
        if (isFull())
            expand();
        top++;
        System.out.println("top :" + top);
        System.out.println("size :" + stackArr.length);
        stackArr[top] = x;
        return x;


    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Error: Stack is underflow");
            return -1;
        } else {
            return stackArr[top];

        }
    }

    public static void printStack() {
        for (int i : stackArr) {
            System.out.println("PrintStack " + i);
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
        if (isEmpty()) {
            System.out.println("stack is underflow");
            return -1;
        } else {
            int pop = stackArr[top];
            top--;
            return pop;
        }
    }

    public static void main(String[] args) {

        push(1);
        push(2);
        printStack();
        push(3);
        push(4);
        push(5);
        push(6);
        printStack();


    }
}
