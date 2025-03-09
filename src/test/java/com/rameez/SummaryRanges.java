package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/summary-ranges/

class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();

        if (nums.length == 0) {
            return ans;
        }
        Integer lastIntInSb = nums[0];
        StringBuilder sb = new StringBuilder(lastIntInSb.toString());

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (lastIntInSb != nums[i - 1]) {
                    sb.append("->");
                    sb.append(nums[i - 1]);
                }

                ans.add(sb.toString());

                lastIntInSb = nums[i];
                sb = new StringBuilder(lastIntInSb.toString());
            }
        }

        if (lastIntInSb != nums[nums.length - 1]) {
            sb.append("->");
            sb.append(nums[nums.length - 1]);
        }

        ans.add(sb.toString());

        return ans;
    }

    @Test
    void test() {

    }
}
