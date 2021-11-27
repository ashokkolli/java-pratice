package core;

import java.util.Stack;

public class _224_Basic_Calculator {

    public static void main(String[] args) {

    }
   // https://leetcode.com/submissions/detail/554371255/
    public static int calculator(String input){
            int len  = input.length();
            int sign  = 1;
            int res = 0;
            Stack<Integer> stack = new Stack<>();
            for(int i = 0; i < len; i++){
                if(Character.isDigit(input.charAt(i))){
                    int sum = input.charAt(i) - '0';
                    while(i + 1 < len && Character.isDigit(input.charAt(i+1))){
                        sum = sum * 10 + input.charAt(i+1) - '0';
                        i++;
                    }
                    res = res + sum*sign;
                }else if(input.charAt(i) == '+')
                    sign = 1;
                else if (input.charAt(i) == '-')
                    sign = -1;
                else if(input.charAt(i) == '('){
                    stack.push(res);
                    stack.push(sign);
                    //reset res and sign
                    res = 0;
                    sign = 1;
                }else if(input.charAt(i) == ')'){
                    res = res*stack.pop() + stack.pop();
                }

            }
        return res;


    }
}
