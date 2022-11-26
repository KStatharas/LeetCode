package TwoSum;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> nummap = new HashMap<>();
        int[] result = new int[2];
        int sum = target;

        for (int i = 0; i < nums.length; i++) {
            sum = target - nums[i];
            if (nummap.containsKey(sum)){
                int otherIndex = nummap.get(sum);
                if (otherIndex > i){
                    result[0] = i;
                    result[1] = otherIndex;
                }
                else{
                    result[0] = otherIndex;
                    result[1] = i;
                }
                return result;
            }
            nummap.put(nums[i],i);
            sum = target;
        }

        return null;
     }
}
