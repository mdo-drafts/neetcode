package solved.p_04_stack.nc024_M_04_22_Generate_Parentheses;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    List<String> result = new ArrayList<>();
    int n;
    public List<String> generateParenthesis(int n) {
        this.n = n;
        Stack<String> stack = new Stack<>();
        backtrack(stack, 0, 0);
        return result;
    }

    private void backtrack(Stack<String> stack, int open, int closed) {
        if (n == open && n == closed) {
            result.add(String.join("", stack));
        }
        if (open < n) {
            stack.push("(");
            backtrack(stack, open + 1, closed);
            stack.pop();
        }
        if (closed < open) {
            stack.push(")");
            backtrack(stack, open, closed + 1);
            stack.pop();
        }
    }
}
