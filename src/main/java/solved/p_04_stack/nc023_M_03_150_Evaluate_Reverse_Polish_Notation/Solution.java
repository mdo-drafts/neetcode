package solved.p_04_stack.nc023_M_03_150_Evaluate_Reverse_Polish_Notation;

import java.util.Stack;

public class Solution {

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();


        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.add(Integer.valueOf(token));
            } else {
                int a1 = stack.pop();
                int a2 = stack.pop();

                if ("+".equals(token)) {
                    stack.push(a2 + a1);
                }
                if ("-".equals(token)) {
                    stack.push(a2 - a1);
                }
                if ("*".equals(token)) {
                    stack.push(a2 * a1);
                }
                if ("/".equals(token)) {
                    stack.push(a2 / a1);
                }
            }
        }
        return stack.pop();
    }

    public static boolean isNumeric(String str) {
        //TODO: IMPORTANT Integer RegExp
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
