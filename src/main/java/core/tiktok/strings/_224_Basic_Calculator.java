package core.tiktok.strings;

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
                    while(i + 1 < len && Character.isDigit(input.charAt(i+1))){   //construct a multi-digits number if any, e.g. "23" = 2*10+3 = 23
                        sum = sum * 10 + input.charAt(i+1) - '0';
                        i++;
                    }
                    res = res + sum*sign; //                 Sum up the intermediate result
                }else if(input.charAt(i) == '+') //          The next number will be using +
                    sign = 1;
                else if (input.charAt(i) == '-') //          the next number will be using -
                    sign = -1;
                else if(input.charAt(i) == '('){
                    stack.push(res);                         // put the intermediate result(from the front) and sign into the stack
                    stack.push(sign);
                    res = 0;                                 //since we have put the intermediate result in stack,
                    sign = 1;                                // we can reset the things for calculation starting from this (
                }else if(input.charAt(i) == ')'){            //  last item is the sign we saved for calculation e.g. 1+(2+3) the 1st +
                    sign  = stack.pop();                     // previousLevelResult the intermediate result before this level, (xxx)
                    int preResult = stack.pop();

                    res = res*sign + preResult;
                }

            }
        return res;


    }
}
