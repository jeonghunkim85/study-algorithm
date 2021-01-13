package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P1_Twosum {

    public int[] twoSum(int[] nums, int target) {

        for(var i=0 ; i < nums.length ; i++) {
            var diff = target - nums[i];

            for(var j=i+1; j < nums.length ; j++) {
                if(target - nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    public int[] twoSum2(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap();

        for(int i=0 ; i < nums.length ; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }

        throw new RuntimeException("there is no solution");
    }
}
