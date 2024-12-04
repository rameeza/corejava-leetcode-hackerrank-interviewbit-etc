package com.rameez;

import org.junit.Test;

import java.util.Arrays;

// https://leetcode.com/problems/majority-element/

public class MajorityElement {

    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        return nums[(nums.length) / 2];
    }

    @Test
    public void main() {
    }
}