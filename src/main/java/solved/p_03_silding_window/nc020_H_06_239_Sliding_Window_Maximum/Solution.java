package solved.p_03_silding_window.nc020_H_06_239_Sliding_Window_Maximum;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] result = new int[nums.length - k + 1];

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            queue.add(nums[i]);
        }

        result[0] = Collections.max(queue);

        int r = k;
        int p = 1;
        while (r < nums.length) {
            queue.poll();
            queue.add(nums[r]);
            result[p] = Collections.max(queue);
            r++;
            p++;
        }
        return result;
    }
}
