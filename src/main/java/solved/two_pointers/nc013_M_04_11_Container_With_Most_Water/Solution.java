package solved.two_pointers.nc013_M_04_11_Container_With_Most_Water;

public class Solution {
    public int maxArea(int[] height) {
        int maxAmount = 0;

        int l = 0;
        int r = height.length - 1;

        while (l < r) {
            int currMax = Math.min(height[l], height[r]) * (r - l);
            maxAmount = Math.max(maxAmount, currMax);
            if (height[l] < height[r]) {
                l++;
            } else {
                //TODO: INDEXES!!! should be '--' NOT '++'
                r--;
            }
        }
        return maxAmount;
    }
}
