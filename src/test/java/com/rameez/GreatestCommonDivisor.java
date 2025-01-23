package com.rameez;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/greatest-common-divisor/

public class GreatestCommonDivisor {
    public int gcd(int A, int B) {
        int gcd = 1;

        int l = A > B ? A : B;
        int s = A == l ? B : A;

        // when 1 of the no is 0, the absolute value of the other no is the gcd
        if (s == 0) {
            return l;
        } else if (l == 0) {
            return Math.abs(s);
        }

        while (true) {
            int remainder = l % s;
            if (remainder == 0) {
                gcd = s;
                break;
            }
            l = s;
            s = remainder;
        }

        return gcd;
    }

    @Test
    public void main() {
        assertEquals(gcd(10, 5), 5);
    }
}