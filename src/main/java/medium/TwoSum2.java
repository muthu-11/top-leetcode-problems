package medium;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum2 {

    public int[] indices(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;

        while( start <= end){
            int sum = numbers[start] + numbers[end];
            if(sum > target)
                end--;
            else if(sum < target)
                start++;
            else
                return new int[]{start+1, end+1};
        }
        return null;
    }

}
