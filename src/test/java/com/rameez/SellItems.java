package com.rameez;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/sell-items/

public class SellItems {

    public int solve(int A, int B) {
        double x = B;
        return (int) Math.ceil(x / (5 * A));
    }

    @Test
    public void main() {
        assertEquals(solve(3, 17), 2);
    }
}