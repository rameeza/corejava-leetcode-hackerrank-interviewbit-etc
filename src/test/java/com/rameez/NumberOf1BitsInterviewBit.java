package com.rameez;

import org.junit.jupiter.api.Test;

// https://www.interviewbit.com/problems/number-of-1-bits/

class NumberOf1BitsInterviewBit {

    public int numSetBits(long a) {
        int answer = 0;
        while (a != 0) {
            answer += (a & 1);
            a = a >>> 1;
        }
        return answer;
    }

    @Test
    void test() {

    }
}
