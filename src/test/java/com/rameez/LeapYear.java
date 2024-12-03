package com.rameez;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/leap-year/

public class LeapYear {

    public int solve(int A) {
        if ((A % 100 == 0) && (A % 400 != 0)) {
            return 0;
        }
        return (A % 4 == 0) ? 1 : 0;
    }

    @Test
    public void main() {
        assertEquals(solve(2100), 0);
        assertEquals(solve(2400), 1);
        assertEquals(solve(2020), 1);
    }
}