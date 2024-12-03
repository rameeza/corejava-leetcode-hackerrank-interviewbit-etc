package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/socks-pair/

public class SocksPair {

    public int solve(ArrayList<Integer> A) {
        if (A.size() < 2) {
            return 0;
        }

        Collections.sort(A);
        int prev = A.get(0);
        int count = 1;
        int answer = 0;

        for (int i = 1; i < A.size(); i++) {
            int current = A.get(i);
            if ((current == prev) && (count == 1)) {
                answer++;
                count = 0;
            } else {
                count = 1;
            }
            prev = current;
        }

        return answer;
    }

    @Test
    public void main() {
    }
}