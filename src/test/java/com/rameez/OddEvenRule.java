package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/odd-even-rule/

public class OddEvenRule {

    public int solve(ArrayList<Integer> A, int B, int C) {

        int mod = B % 2;
        long count = A.stream()
                .filter(x -> x % 2 != mod)
                .count();

        return (int) count * C;
    }

    @Test
    public void main() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(solve(list, 31, 100), 100);
    }
}