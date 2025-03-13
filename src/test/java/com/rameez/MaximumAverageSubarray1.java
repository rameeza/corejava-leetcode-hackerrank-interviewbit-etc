package com.rameez;

import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/maximum-average-subarray-i/

class MaximumAverageSubarray1 {

    public double findMaxAverage(int[] nums, int k) {
        if (nums.length < k) {
            return 0;
        }

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        double ans = 1;
        return ans * maxSum / k;
    }

    @Test
    void test() {
    }
}
