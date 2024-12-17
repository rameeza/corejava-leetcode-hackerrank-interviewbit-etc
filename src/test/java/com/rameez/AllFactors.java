package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

// https://www.interviewbit.com/problems/all-factors/

public class AllFactors {

    public ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> answer = new ArrayList<>();

        int limit = A;
        for (int i = 1; i <= limit; i++) {
            if (A % i == 0) {
                answer.add(i);
                // Don't add 5 to answer twice when A is 25.
                if (i != (A / i)) {
                    answer.add(A / i);
                }
                // make code faster by reducing total no of iterations.
                limit = A / i - 1;
            }
        }

        Collections.sort(answer);
        return answer;
    }

    @Test
    public void main() {
    }
}