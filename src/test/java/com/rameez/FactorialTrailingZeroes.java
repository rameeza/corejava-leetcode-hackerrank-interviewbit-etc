package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/factorial-trailing-zeroes/

public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int powerOf5InFactorial = 0;
        for (int i = n; i >= 5; i--) {
            for (int j = 1; ; j++) {
                if (i % (int) (Math.pow(5, j)) == 0) {
                    powerOf5InFactorial++;
                } else {
                    break;
                }
            }
        }

        return powerOf5InFactorial;
    }

    @Test
    public void main() {

    }
}