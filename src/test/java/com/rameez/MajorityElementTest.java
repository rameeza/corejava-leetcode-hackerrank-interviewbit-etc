package com.rameez;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/majority-element/

public class MajorityElementTest {

    /**
     * Find the element that occurs most frequently (it is given that it will occur more than (size-of-list/2) times.
     * @param A
     * @return
     */
    public int majorityElement(final List<Integer> A) {

        Integer[] arr = A.stream()
                .sorted()
                .toArray(Integer[]::new);

        return arr[(arr.length) / 2];
    }

    @Test
    public void main() {

        List<Integer> A = List.of(1, 2, 3, 1, 1, 1, 4, 1);
        assertEquals("Unexpected output", 1, majorityElement(A));

    }
}