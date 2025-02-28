package com.rameez;

import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/counting-bits/

class CountingBits {

    public int[] countBits(int n) {
        int[] answer = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int count = 0;
            int no = i;
            for (int j = 0; no != 0; j++) {
                count += (no & 1);
                no = no >>> 1;
            }
            answer[i] = count;
        }
        return answer;
    }

    @Test
    void test() {

    }
}
