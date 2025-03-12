package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/contains-duplicate-ii/

class ContainsDuplicate2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        boolean ans = false;

        for (int i = 0; i < nums.length; i++) {
            int no = nums[i];
            if (map.containsKey(no)) {
                int index = map.get(no);
                if (i - index <= k) {
                    ans = true;
                    break;
                } else {
                    map.replace(no, i);
                }
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
