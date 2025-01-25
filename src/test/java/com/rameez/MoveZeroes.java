package com.rameez;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/move-zeroes/

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int indexOfNon0 = 0;
        int i = 0;

        // insert all the non 0 values
        for (; i < nums.length; i++) {
            for (; indexOfNon0 < nums.length && nums[indexOfNon0] == 0; indexOfNon0++) {
            }
            if (indexOfNon0 == nums.length) {
                break;
            }
            nums[i] = nums[indexOfNon0++];
        }

        // insert 0s at the end
        while (i < nums.length) {
            nums[i++] = 0;
        }
    }

    @Test
    public void main() {

    }
}