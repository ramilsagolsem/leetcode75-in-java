package com.code.challenge.leetcode75.level1.prefix_sum;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 * @see <a href="https://leetcode.com/problems/running-sum-of-1d-array/">label</a>
 */
public class RunningSumOf1DArray {

    /**
     * The algo runs in time complexity of O(n) with the assumption that the array can be modified which keeps the space complexity O(1).
     * However, if array cannot be modified then space complexity would be O(n) due to use of additional array
     * @param nums
     * @return
     */
    public int[] runningSum(int[] nums) {
        for( int i=1; i<nums.length ; i++){
            /*
             Tracking the sum and adding the same to the next element so that the summation is
             not lost which eliminates the need of additional loop to for the summation
             */
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }

}
