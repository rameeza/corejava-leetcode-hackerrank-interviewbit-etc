package com.rameez;

import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/n-th-tribonacci-number/

class NthTribonacciNumber {

    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            int answer = 0;
            int x = 0, y = 1, z = 1;

            for (int i = 3; i <= n; i++) {
                answer = x + y + z;
                x = y;
                y = z;
                z = answer;
            }
            return answer;
        }
    }

    @Test
    void test() {
    }
}
