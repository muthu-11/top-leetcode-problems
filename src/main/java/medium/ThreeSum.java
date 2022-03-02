package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/3sum/
public class ThreeSum {

    public List<List<Integer>> triplets(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();

        if (nums.length < 3)
            return triplets;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            //Below condition ensures no duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int target = 0 - nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum > target)
                    right--;
                else if (sum < target)
                    left++;
                else {
                    triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
//                    right--;
                    //Below condition eliminates the duplicates from left
                    while (nums[right] == nums[right - 1] && left < right)
                        right--;
                    right--;
                }
            }
        }

        return triplets;
    }

}
