package unsolved.p_04_stack.nc027_H_07_84_Largest_Rectangle_in_Histogram;

import java.util.Stack;

public class Solution {
    public int largestRectangleArea(int[] heights) {

        int maxArea = 0;
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < heights.length; i++) {
            int currHeight = heights[i];
            int currIndex = i;
            while (!stack.isEmpty() && currHeight < stack.peek()[0]) {
                int[] item = stack.pop();
                int height = item[0];
                int index = item[1];

                int currArea = height * (i - index);
                maxArea = Math.max(maxArea, currArea);
                currIndex = index;
            }
            stack.push(new int[]{currHeight, currIndex});
        }

        for (int[] item : stack) {
            maxArea = Math.max(maxArea, item[0] * (heights.length - item[1]));
        }

        return maxArea;
    }
}
