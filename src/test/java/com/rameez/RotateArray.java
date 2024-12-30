package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/rotate-array


public class RotateArray {

    public void rotate(int[] nums, int k) {
        int[] lastElements = new int[k];

        // to avoid error in cases where k is more than nums.length
        k = k % (nums.length);

        for (int i = nums.length - 1, j = k - 1; j >= 0; i--, j--) {
            lastElements[j] = nums[i];
        }

        for (int i = nums.length - 1 - k; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = lastElements[i];
        }
    }

    @Test
    public void main() {

    }
}