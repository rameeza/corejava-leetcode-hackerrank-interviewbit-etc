package com.rameez;

import org.junit.Test;

// https://www.interviewbit.com/problems/diagonal-flip/

public class DiagonalFlip {

    public int[][] solve(int[][] A) {
        int[][] answer = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                answer[j][i] = A[i][j];
            }
        }

        return answer;
    }

    @Test
    public void main() {
    }
}