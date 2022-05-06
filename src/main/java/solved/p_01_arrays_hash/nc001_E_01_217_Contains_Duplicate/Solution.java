package solved.p_01_arrays_hash.nc001_E_01_217_Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        for(int num : nums){
            if(visited.contains(num)){
                return true;
            }
            visited.add(num);
        }
        return false;
    }
}
