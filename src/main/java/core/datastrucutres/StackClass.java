package core.datastrucutres;

import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Stack<Integer> stack = new Stack<>();
        pushStack(stack);
        peekStack(stack);
        search(stack, 3);
        popStack(stack);

    }

    static void pushStack(Stack<Integer> stack) {
        for (int i = 1; i <= 5; i++)
            stack.push(i);
    }

    static void popStack(Stack<Integer> stack) {
        Integer x;
        for (int i = 1; i < 3; i++) {
            x = stack.pop();
            System.out.println(x);
        }
    }

    static void peekStack(Stack<Integer> stack) {
        System.out.println("Peek Stack :" + stack.peek());
    }

    static void search(Stack<Integer> stack, int element) {
        Integer pos = stack.search(element);
        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position " + pos);


    }
}
	
