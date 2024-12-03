package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// https://leetcode.com/problems/remove-element

public class RemoveElement {

    // APPROACH 1: SLOWER
    public int removeElement(int[] nums, int val) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = Integer.MAX_VALUE;
            } else {
                answer++;
            }
        }
        Arrays.sort(nums);
        return answer;
    }

    // APPROACH 2: FASTER
    public int removeElement2(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    @Test
    public void main() {
    }
}