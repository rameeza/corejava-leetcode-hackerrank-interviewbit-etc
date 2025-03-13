package com.rameez;

import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/find-the-highest-altitude/

class FindTheHightestAltitude {

    public int largestAltitude(int[] gain) {
        int ans = 0;

        int curHeight = 0;
        for (int i = 0; i < gain.length; i++) {
            curHeight += gain[i];
            if (curHeight > ans) {
                ans = curHeight;
            }
        }
        return ans;
    }

    @Test
    void test() {
    }
}
