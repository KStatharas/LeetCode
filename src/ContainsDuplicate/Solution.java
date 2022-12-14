package ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numset = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numset.contains(nums[i])){
                return true;
            }
            numset.add(nums[i]);
        }
        return false;
    }
}
