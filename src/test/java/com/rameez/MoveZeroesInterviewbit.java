package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

// https://www.interviewbit.com/problems/move-zeroes/

public class MoveZeroesInterviewbit {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int initialSize = A.size();

        // removes all the occurences of all the elements in the argument list.
        A.removeAll(Arrays.asList(0));

        int newSize = A.size();

        for (int i = 1; i <= initialSize - newSize; i++) {
            A.add(0);
        }
        return A;
    }

    @Test
    public void main() {

    }
}