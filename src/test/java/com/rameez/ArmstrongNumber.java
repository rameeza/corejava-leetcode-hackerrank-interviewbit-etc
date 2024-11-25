package com.rameez;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/armstrong-number/

public class ArmstrongNumber {

    public int solve(int A) {
        int aInitial = A;
        int answer = 0;

        int noOfDigits;

        // Math.pow() returns Double. so, == 0 failed.
        for (noOfDigits = 1; (A / Math.pow(10, noOfDigits)) >= 1; noOfDigits++) {
        }

        int sum = 0;
        for (; A > 0; ) {
            int lastDigit = A % 10;
            A = A / 10;
            sum += Math.pow(lastDigit, noOfDigits);
        }

        if (sum == aInitial) {
            answer = 1;
        }

        return answer;
    }

    @Test
    public void main() {
        assertEquals(solve(371), 1);
    }
}