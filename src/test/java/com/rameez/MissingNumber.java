package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/missing-number/

class MissingNumber {

    // METHOD 1: SLOW (Passes all test cases)
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        if (nums[0] != 0) {
            return 0;
        } else if (nums[nums.length - 1] != nums.length) {
            return nums.length;
        } else {

            for (int i = 1; i <= nums.length - 1; i++) {
                if (nums[i] != nums[i - 1] + 1) {
                    ans = nums[i - 1] + 1;
                    break;
                }
            }
        }
        return ans;
    }

    // METHOD 2: FASTER (Passes all test cases)
    public int missingNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int ans = 0;
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                ans = i;
            }
        }
        return ans;
    }

    // METHOD 3: FASTEST (Passes all test cases)
    public int missingNumber3(int[] nums) {
        int l = nums.length;
        int expectedSum = (l * (l + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return (expectedSum - sum);

    }

    @Test
    void test() {

    }
}
