package easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/
public class TwoSum {

    int[] indices(int[] nums, int target){

        Map<Integer, Integer> indices = new HashMap<>();

        int num;
        for(int index=0; index < nums.length; index++){
            num = target - nums[index];
            if(indices.containsKey(num))
                return new int[]{indices.get(num), index};
            indices.put(nums[index],index);
        }

        return new int[]{};
    }

}
