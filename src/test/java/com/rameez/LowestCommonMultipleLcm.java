package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

// https://www.interviewbit.com/problems/lowest-common-multiple-lcm/

public class LowestCommonMultipleLcm {

    public Long solve(int A, int B) {
        int hcf = hcf(A, B);
        return ((long) A * B) / hcf;
    }

    public int hcf(int A, int B) {
        int smallerNo = Math.min(A, B);
        int biggerNo = Math.max(A, B);
        while (biggerNo % smallerNo != 0) {
            int remainder = biggerNo % smallerNo;

            if (remainder != 0) {
                biggerNo = smallerNo;
                smallerNo = remainder;
            }
        }
        return smallerNo;
    }

    @Test
    public void main() {
    }
}