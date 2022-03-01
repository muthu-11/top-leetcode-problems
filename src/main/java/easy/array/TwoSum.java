package easy.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    int[] indices(int[] nums, int target){

        Map<Integer, Integer> indices = new HashMap<>();

        int first, second;
        for(int index=0; index < nums.length; index++){
            first = nums[index];
            second = target - first;
            if(indices.containsKey(second))
                return new int[]{indices.get(second), index};
            indices.put(nums[index],index);
        }

        return new int[]{};
    }

}
