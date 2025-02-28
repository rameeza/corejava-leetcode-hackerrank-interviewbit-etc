package com.rameez;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/number-of-1-bits/

class NumberOf1Bits {

    public int hammingWeight(int n) {
        int answer = 0;
        for (int i = 0; n > 0; i++) {
            answer += (n & 0x00000001);
            n = n >>> 1;
        }
        return answer;

    }

    @Test
    void test() {

    }
}
