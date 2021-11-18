package core.imp.stack.practice_1;

import java.awt.*;
import java.util.HashMap;

/**
 * Created by Ashok Kolli on 6/23/2020
 */

public class StackWithArray {

    private static final int SIZE = 5;
    private static final int[] stackArr = new int[SIZE];
    private static int top = -1;

    public static boolean isEmpty() {
        return top == -1;
    }

    public static boolean isFull() {
        return top == SIZE - 1;
    }

    public static int push(int x) {
        if (isFull()) {
            System.out.println("Error: Stack Overflow");
            return -1;
        } else {
            top++;
            stackArr[top] = x;
            return x;
        }

    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Error: Stack is underflow");
            return -1;
        } else {
            return stackArr[top];

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
            System.out.println("core.imp.stack is underflow");
            return -1;
        } else {
            int pop = stackArr[top];
            top--;
            return pop;
        }
    }


    public static void main(String[] args) {
        String str = "ResumedActivity: ActivityRecord{334a130 u0 com.att.firstnet.grey/com.samsung.android.sptt.activity.channeldetail.ChannelDetailActivity t213}";
        String[] stra = str.split("/");
        for (String s : stra) {
            System.out.println(s);
        }

        String str2 = "abc";

        String str3 = str2 + str2.toCharArray()[1];
        System.out.println(str3);

        HashMap<Integer, Point> hs = new HashMap<>();
        hs.put(1, new Point(1, 2));

        System.out.println(hs.get(1).x);
        System.out.println(hs.get(1).y);



     /*   System.out.println(push(1));
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
        System.out.println(pop());*/

    }
}
