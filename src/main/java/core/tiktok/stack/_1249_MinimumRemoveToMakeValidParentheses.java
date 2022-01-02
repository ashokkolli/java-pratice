package core.tiktok.stack;

import java.util.*;

public class _1249_MinimumRemoveToMakeValidParentheses {
    //https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/solution/

    public static String minRemoveToMakeValid(String str){
        //Traverse the String, push the index to Queue when there is "("
        //Pop from Queue when there is ")" only when Queue is not empty.
        // if Queue is empty, push the indx to hashset
        Set<Integer> indxSet = new HashSet<>();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '('){
                stack.push(i);
            }if(str.charAt(i) == ')'){
                if(stack.isEmpty())
                    indxSet.add(i);
                else{
                    stack.pop();
                }
            }
        }
        // Put any indexes remaining on stack into the set.
        while(!stack.isEmpty())
            indxSet.add(stack.pop());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(!indxSet.contains(i))
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    

}
