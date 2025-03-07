package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/power-of-three/

class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        boolean answer = true;
        while (n > 1) {
            if (n % 3 != 0) {
                answer = false;
                break;
            }
            n = n / 3;
        }
        return answer;
    }

    @Test
    void test() {

    }
}
