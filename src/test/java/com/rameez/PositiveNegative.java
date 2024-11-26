package com.rameez;

import org.junit.Test;

import java.util.ArrayList;

// https://www.interviewbit.com/problems/positive-negative/

public class PositiveNegative {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> answer = new ArrayList<>();

        Integer posCount = 0, negCount = 0;

        for (int i = 0; i < A.size(); i++) {

            int x = A.get(i);
            if (x > 0) {
                posCount++;
            } else if (x < 0) {
                negCount++;
            }
        }
        answer.add(posCount);
        answer.add(negCount);

        return answer;
    }

    @Test
    public void main() {

    }
}