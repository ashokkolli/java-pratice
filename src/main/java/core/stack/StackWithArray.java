package core.stack;

public class StackWithArray {
    int top;
    int[] stack;

    public StackWithArray(int sizeOfStack) {
        top = -1;
        stack = new int[sizeOfStack];
    }

    public static void main(String[] args) {
        StackWithArray sa = new StackWithArray(3);
        sa.push(1);
        sa.push(2);
        sa.push(3);
        sa.traverse();
        int pop = sa.pop();
        System.out.println(pop);
        pop = sa.pop();
        System.out.println(pop);
        pop = sa.pop();
        System.out.println(pop);
        sa.traverse();

    }

    public void traverse() {

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public void push(int item) {
        if (isFull()) {
            System.exit(1);
        } else {
            stack[++top] = item;

        }
    }

    public int pop() {
        if (isEmpty()) {
            System.exit(1);
            return 0;
        } else
            return stack[top--];
    }

    public boolean isEmpty() {
        if (top == -1) {
            System.out.println("core.stack is underflow");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }


    }

    public boolean isFull() {
        if (stack.length == top - 1) {
            System.out.println("core.stack is overflow");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }

    }
}
