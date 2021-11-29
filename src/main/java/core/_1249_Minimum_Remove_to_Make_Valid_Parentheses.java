package core;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class _1249_Minimum_Remove_to_Make_Valid_Parentheses {

    public static void main(String[] args) {
        minToRemoveToMakeValid("abc((defgh");
    }

    public static String minToRemoveToMakeValid(String str){
        Set<Integer> indexToRemove = new HashSet<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '('){
                stack.push(i);
            }
            if(str.charAt(i) == ')'){
                if(stack.isEmpty())
                    indexToRemove.add(i);
                else{
                    stack.pop();
                }

            }
        }

        //put any indexes remaining on stack into the set

        while (!stack.isEmpty()){
            indexToRemove.add(stack.pop());
        }
        //Build the string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if(!indexToRemove.contains(i)){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }


}
