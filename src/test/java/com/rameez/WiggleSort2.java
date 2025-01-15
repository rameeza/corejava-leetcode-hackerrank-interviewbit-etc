package com.rameez;

import org.junit.Test;

import java.util.Arrays;

// https://leetcode.com/problems/wiggle-sort-ii/

public class WiggleSort2 {

    public void wiggleSort(int[] nums) {
        int[] sorted = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sorted[i] = nums[i];
        }
        Arrays.sort(sorted);

        int halfLength = nums.length / 2;
        // when length of nums is odd, it will have 1 greater no of depths than heights
        for (int i = 0, indexInSorted = nums.length - 1; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = sorted[indexInSorted - halfLength]; // insert depths
            } else {
                nums[i] = sorted[indexInSorted--]; // insert heights
            }
        }
    }

    @Test
    public void main() {

    }
}