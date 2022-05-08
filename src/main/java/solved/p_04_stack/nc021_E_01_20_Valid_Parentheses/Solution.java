package solved.p_04_stack.nc021_E_01_20_Valid_Parentheses;

import java.util.Map;
import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {

        Map<Character, Character> bracketMap = Map.of('(', ')', '[', ']', '{', '}');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (bracketMap.containsKey(c)) {
                stack.push(c);
            } else {
                //TODO: Check all cases: "((((", "]"
                if (stack.isEmpty() || c != bracketMap.get(stack.pop())) return false;
            }
        }
        return stack.isEmpty();
    }
}
