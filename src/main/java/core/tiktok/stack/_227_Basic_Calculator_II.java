package core.tiktok.stack;



//https://leetcode.com/problems/basic-calculator-ii/solution/

//UNIFIED SOLUTION for BASIC CALC 1 and 2
//https://medium.com/@CalvinChankf/solving-basic-calculator-i-ii-iii-on-leetcode-74d926732437


import java.util.Stack;

public class _227_Basic_Calculator_II {


    _227_Basic_Calculator_II(int x){

    }
    public int calculate(String s) {
        // 22 - 3 * 5
        if (s == null || s.isEmpty()) return 0;
        int len = s.length();
        Stack<Integer> stack = new Stack<Integer>();
        int currNum = 0;
        char operation = '+';
        for (int i = 0; i < len; i++) {
            char currChar = s.charAt(i);
            if (Character.isDigit(currChar)) {
                currNum = (currNum * 10) + (currChar - '0');
            }
            if (!Character.isDigit(currChar) && !Character.isWhitespace(currChar) || i == len - 1) {
                if (operation == '-') {
                    stack.push(-currNum);
                }
                else if (operation == '+') {
                    stack.push(currNum);
                }
                else if (operation == '*') {
                    stack.push(stack.pop() * currNum);
                }
                else if (operation == '/') {
                    stack.push(stack.pop() / currNum);
                }
                operation = currChar;
                currNum = 0;
            }
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {


    }

}
