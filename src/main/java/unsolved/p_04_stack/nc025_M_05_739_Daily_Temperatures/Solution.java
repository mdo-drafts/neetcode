package unsolved.p_04_stack.nc025_M_05_739_Daily_Temperatures;

import java.util.Stack;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > stack.peek()[0]) {
                int[] temp = stack.pop();
                result[temp[1]] = i - temp[1];
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return result;
    }
}
