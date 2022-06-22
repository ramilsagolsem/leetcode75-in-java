package com.code.challenge.leetcode75.level1.prefix_sum;

/**
 * Given an array of integers nums, calculate the pivot index of this array.
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 * Return the leftmost pivot index. If no such index exists, return -1.
 *
 * @see <a href="https://leetcode.com/problems/find-pivot-index">label</a>
 */
public class FindPivotIndex {

    /**
     * Algo:
     * 1. Sum of left elements is iteratively stored in variable left_sum
     * 2. Sum of right elements is always equal to [ sum of all elements - (sum of left elements + element at the current index) ]
     *
     * Time complexity : O(n)
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums) {
        int sum=0;
        /**
         * Stores the sum of all the elements
         */
        for(int x: nums){
            sum += x;
        }

        int left_sum=0;
        for(int i=0; i<nums.length; i++){
            /**
             * sum of right elements is always equal to [ sum of all elements - (sum of left elements + element at the current index) ]
             */
            int right_sum = sum - (left_sum + nums[i]);
            if(left_sum == right_sum){
                return i;
            }
            /**
             * Stores the sum of left elements iteratively
             */
            left_sum += nums[i];
        }
        return -1;
    }
}
