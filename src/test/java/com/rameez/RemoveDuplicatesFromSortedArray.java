package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int answer = 1;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (!(nums[i] == prev)) {
                answer++;
                prev = nums[i];
            } else {
                nums[i] = Integer.MAX_VALUE;
            }
        }

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != Integer.MAX_VALUE) {
                nums[index++] = nums[i];
            }
        }
        return answer;
    }

    @Test
    public void main() {
        removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }
}