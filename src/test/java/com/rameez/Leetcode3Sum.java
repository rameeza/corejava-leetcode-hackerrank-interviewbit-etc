package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/3sum/

public class Leetcode3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();

        if (nums.length < 3) {
            return answer;
        }

        Arrays.sort(nums);

        for (int i = 0; i <= nums.length - 3; i++) {
            // avoid duplicates
            if ((i != 0) && (nums[i] == nums[i - 1])) {
                continue;
            }

            int no1 = nums[i];
            if (no1 > 0) {
                continue;
            }

            // use 2 pointers to see if there are 2 elements whose sum is (-)no1;

            int backIndex = nums.length - 1;
            for (int frontIndex = i + 1; frontIndex < nums.length - 1 && backIndex > frontIndex; ) {
                // avoid duplicates
                if (frontIndex != i + 1 && nums[frontIndex] == nums[frontIndex - 1]) {
                    frontIndex++;
                    continue;
                }

                int no2 = nums[frontIndex];
                int no3 = nums[backIndex];

                // an answer found
                if (no2 + no3 == -no1) {
                    answer.add(List.of(no1, no2, no3));
                    frontIndex++;
                } else if (no2 + no3 + no1 > 0) {
                    backIndex--;
                } else if (no2 + no3 + no1 < 0) {
                    frontIndex++;
                }
            }
        }
        return answer;
    }

    @Test
    public void main() {
        threeSum(new int[]{1, -1, -1, 0});
    }
}