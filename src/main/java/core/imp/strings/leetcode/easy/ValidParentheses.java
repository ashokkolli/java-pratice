package core.imp.strings.leetcode.easy;

import java.util.HashMap;
import java.util.Stack;


public class ValidParentheses {
    static HashMap<Character, Character> map;

    public static void main(String[] args) {
        String str = "{([])}";
        boolean b = isValid(str);
        System.out.println(b);
    }

    public static boolean isValid(String str) {
        map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                if (stack.isEmpty())
                    return false;
                char topElement = stack.pop();
                if (topElement != map.get(c))
                    return false;
            } else
                stack.push(c);
        }
        return stack.isEmpty();
    }

}
