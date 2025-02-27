package com.rameez;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/reverse-bits/

class ReverseBits {
    // you need treat n as an unsigned value
    // METHOD 1: WITHOUT USING BITWISE OPERATOR
    public int reverseBits(int n) {
        int answer = 0;

        // handle 0th index bit of the input.
        if (n % 2 != 0) {
            answer += Integer.MIN_VALUE;
        }

        // 'n' bits can represent nos from "(-) 2pow(n-1)" to "2pow(n-1) - 1".
        for (int i = 1; i <= 30; i++) {
            int ithBit = ((int) Math.pow(2, i)) & n;
            if (ithBit != 0) {
                int newBitIndex = 31 - i;
                answer += (int) Math.pow(2, newBitIndex);
            }
        }
        // handle 31st index bit of the input.
        if (n < 0) {
            answer += 1;
        }

        return answer;
    }

    // you need treat n as an unsigned value
    // METHOD 2: USING BITWISE OPERATORS (faster method)
    public int reverseBits2(int n) {

        n = (n >>> 16) | (n << 16);
        n = ((n & 0xff00ff00) >>> 8) | ((n & 0x00ff00ff) << 8);
        n = ((n & 0xf0f0f0f0) >>> 4) | ((n & 0x0f0f0f0f) << 4);
        n = ((n & 0xcccccccc) >>> 2) | ((n & 0x33333333) << 2);
        n = ((n & 0xaaaaaaaa) >>> 1) | ((n & 0x55555555) << 1);
        return n;

    }


    @Test
    void test() {
        assertEquals(964176192, reverseBits(43261596));
    }
}
