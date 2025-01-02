package com.rameez;

import org.junit.Test;

import java.util.Arrays;

// https://leetcode.com/problems/product-of-array-except-self/

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] answer = new int[nums.length];

        // fill prefix array
        int prod = 1;
        for (int i = 0; i < prefix.length; i++) {
            prefix[i] = prod;
            prod *= nums[i];
        }

        // fill suffix array
        prod = 1;
        for (int i = suffix.length - 1; i >= 0; i--) {
            suffix[i] = prod;
            prod *= nums[i];
        }

        // fill answer array
        for (int i = 0; i < answer.length; i++) {
            answer[i] = prefix[i] * suffix[i];
        }

        return answer;
    }

    @Test
    public void main() {

    }
}