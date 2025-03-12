package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate/

class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean ans = false;

        for (int i = 0; i < nums.length; i++) {
            int no = nums[i];

            if (set.contains(no)) {
                ans = true;
                break;
            } else {
                set.add(no);
            }
        }

        return ans;
    }

    @Test
    void test() {

    }
}
