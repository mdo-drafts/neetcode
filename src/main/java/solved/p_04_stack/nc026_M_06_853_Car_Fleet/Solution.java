package solved.p_04_stack.nc026_M_06_853_Car_Fleet;

import java.util.Collections;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        //TODO: use out-of-box comparator to have a TreeMap sorted in the  revers order
        Map<Integer, Integer> carMap = new TreeMap<>(Collections.reverseOrder());

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < position.length; i++) carMap.put(position[i], speed[i]);

        for (Map.Entry<Integer, Integer> carEntry : carMap.entrySet()) {
            //TODO: ALWAYS add (double) to prevent integer division
            double currentTime = (target - carEntry.getKey()) / (double) carEntry.getValue();
            if (stack.isEmpty() || stack.peek() < currentTime) {
                stack.push(currentTime);
            }
        }
        return stack.size();
    }
}
