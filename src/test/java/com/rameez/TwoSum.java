package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/

class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int no = nums[i];
            if (map.containsKey(target - no)) {
                ans[0] = i;
                ans[1] = map.get(target - no);
            } else {
                map.put(no, i);
            }
        }
        return ans;
    }

    @Test
    void test() {

    }
}
