package core.tiktok.stack;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Stack;

public class _232_ImplementQueue_using_TWO_Stacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    int front;

    public void enqueue(int x) {

        if (stack1.isEmpty())
            front = x;  // first element is kept as front queue element
        stack1.push(x);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty())
                throw new EmptyStackException();
            while (stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public boolean isEmpty() {
      return stack1.isEmpty() && stack2.isEmpty();
    }

    public int peek(){
        if(stack2.isEmpty()){
            if(stack1.isEmpty()) return -1;
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();

    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.pop());
    }


}
