package medium;

import java.util.Arrays;

//https://leetcode.com/problems/3sum-smaller/
public class ThreeSumSmaller {

    //Time complexity : O(n^2)
    public int smallerSum(int[] nums, int target) {

        if(nums ==null || nums.length < 3)
            return 0;

        int result = 0;

        Arrays.sort(nums);

        for(int i=0; i< nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int currentSum = nums[i] + nums[left] + nums[right];
                if(currentSum < target) {
                    // All the sums between right and left would be less than the currentSum which will obviously less than target
                    result += right-left;
                    left++;
                }else
                    right--;
            }
        }

        return result;
    }
}
