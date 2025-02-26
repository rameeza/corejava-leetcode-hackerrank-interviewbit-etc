package com.rameez;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/reverse-bits/

class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int answer = 0;

        // handle 0th index bit of the input.
        if (n%2 != 0){
            answer+=Integer.MIN_VALUE;
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
        if (n < 0){
            answer+=1;
        }

        return answer;
    }

    @Test
    void test() {
        assertEquals(964176192, reverseBits(43261596));
    }
}
