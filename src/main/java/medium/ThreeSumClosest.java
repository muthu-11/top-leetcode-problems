package medium;

import java.util.Arrays;

//https://leetcode.com/problems/3sum-closest/
public class ThreeSumClosest {

    // Time complexity : O(n^2)
    public int closestSumUsing2Pointers(int[] nums, int target) {

        //constraint : nums should contain 3 or more numbers
        int closestSum = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);

        for(int i=0; i<nums.length -2; i++){
            int left = i+1;
            int right = nums.length -1;

            while(left < right){
                int currentSum = nums[i] + nums[left] + nums[right];
                if(Math.abs(currentSum - target) < Math.abs(closestSum - target))
                    closestSum = currentSum;
                if(currentSum <= target)
                    left++;
                else
                    right--;
            }
        }

        return closestSum;
    }

}
