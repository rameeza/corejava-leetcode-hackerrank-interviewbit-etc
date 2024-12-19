package com.rameez;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/digital-root/

public class DigitalRoot {

    public int solve(int A) {
        while (A > 9) {
            A = sumOfDigits(A);
        }
        return A;
    }

    public int sumOfDigits(int inp) {
        int answer = 0;

        while (inp > 0) {
            answer = answer + (inp % 10);
            inp /= 10;
        }
        return answer;
    }

    @Test
    public void main() {

    }
}