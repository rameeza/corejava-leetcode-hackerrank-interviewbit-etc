package com.rameez;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/sample-question/

public class SampleQuestion {

    public int solve(int A, int B) {
        return (int) (((long) A + B) % 10000000);
    }

    @Test
    public void main() {
    }
}