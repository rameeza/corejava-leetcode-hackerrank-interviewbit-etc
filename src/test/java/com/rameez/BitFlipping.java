package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

// https://www.interviewbit.com/problems/bit-flipping/

class BitFlipping {

    public int solve(int A) {
        int powOf2 = 0;
        for (powOf2 = 0; ; powOf2++) {
            int val = (int) Math.pow(2, powOf2);
            if (val > A) {
                return ((val - 1) ^ A);
            } else if (val == A) {
                return A - 1;
            }
        }
    }

    @Test
    void test() {

    }
}
