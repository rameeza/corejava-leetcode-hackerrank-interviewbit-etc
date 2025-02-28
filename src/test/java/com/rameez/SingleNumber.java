package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

// https://leetcode.com/problems/single-number/

class SingleNumber {

    // METHOD 1: WITHOUT USING BITWISE OPERATOR (THIS METHOD IS SLOWER TO EXECUTE)
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);

        int answer = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int no = nums[i];
            if (i == 0) {
                if (no != nums[i + 1]) {
                    answer = no;
                    break;
                }
            } else if (i == nums.length - 1) {
                if (no != nums[i - 1]) {
                    answer = no;
                    break;
                }
            } else if ((no != nums[i - 1]) && (no != nums[i + 1])) {
                answer = no;
                break;
            }
        }
        return answer;
    }

    // METHOD 2: USING BITWISE OPERATOR (THIS METHOD IS FASTER TO EXECUTE)
    public int singleNumber2(int[] nums) {
        int answer = 0;
        for (int num : nums) {
            answer ^= num;
        }
        return answer;
    }


    @Test
    void test() {

    }
}
