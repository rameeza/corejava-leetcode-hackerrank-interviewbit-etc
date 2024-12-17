package com.rameez;

import org.junit.Test;

import java.util.Arrays;

// https://www.interviewbit.com/problems/is-rectangle/

public class IsRectangle {

    public int solve(int A, int B, int C, int D) {
        int[] arr = new int[]{A, B, C, D};

        Arrays.sort(arr);

        // these values must be equal for a rectangle
        if ((A != B) || (C != D)) {
            return 0;
        } else {
            return 1;
        }

    }

    @Test
    public void main() {
    }
}