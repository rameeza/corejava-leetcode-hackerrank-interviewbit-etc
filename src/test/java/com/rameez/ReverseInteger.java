package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/reverse-integer/

public class ReverseInteger {

    public int reverse(int A) {
        long answer = 0L;
        boolean isNegative = false;
        if (A < 0) {
            isNegative = true;
            A = -A;
        }

        int noOfDigits = (A + "").length();

        for (; A > 0; A /= 10) {
            int digit = A % 10;
            answer += ((long) digit) * (Math.pow(10, --noOfDigits));
        }

        if (answer > Integer.MAX_VALUE) {
            return 0;
        } else if (isNegative) {
            return (int) -answer;
        } else {
            return (int) answer;
        }
    }

    @Test
    public void main() {

    }
}