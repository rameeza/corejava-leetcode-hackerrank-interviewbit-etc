package com.rameez;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/common-elements/


public class CommonElements {

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> answer = new ArrayList<>();
        Collections.sort(A);
        Collections.sort(B);

        int iA = 0;
        int iB = 0;
        while (iA < A.size() && iB < B.size()) {
            int noInA = A.get(iA);
            int noInB = B.get(iB);

            if (noInA == noInB) {
                answer.add(noInA);
                iA++;
                iB++;
            } else if (noInA < noInB) {
                iA++;
            } else if (noInA > noInB) {
                iB++;
            }
        }

        return answer;
    }


    @Test
    public void main() {

    }
}