package core.apple.arrays.leetcode.hard;

import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        String s  = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(s));
    }
//https://leetcode.com/problems/basic-calculator/
// https://www.youtube.com/watch?v=BjDczS5uQ-g

    public static int calculate(String exp){
        int len = exp.length();
        int res = 0;
        int sign = 1;
        int currNo = 0;
        int ch ;
        Stack<Integer> stack = new Stack<>();
        for(int i =0; i<len; i++){
            if(Character.isDigit(exp.charAt(i))){
                currNo = exp.charAt(i) -'0';
                while (i+1 < len && Character.isDigit(exp.charAt(i+1))){
                    currNo = currNo*10 + exp.charAt(i+1) - '0';
                    i++;
                }
                currNo =currNo*sign;
                res = res+currNo;

                //reset currNo and sign
                currNo = 0;
                sign = 1;

            }else if(exp.charAt(i) == '-'){
                sign = -1;
            }else if(exp.charAt(i) == '+'){
                sign = 1;
            }else if(exp.charAt(i) == '('){
                stack.push(res);
                stack.push(sign);
                //reset res and sign
                res = 0;
                sign = 1;
            }else if(exp.charAt(i) == ')'){
                int prevSign = stack.pop();
                res = res *prevSign;
                int prevRes = stack.pop();
                res = res+ prevRes;
            }

        }

return res;
    }
}
