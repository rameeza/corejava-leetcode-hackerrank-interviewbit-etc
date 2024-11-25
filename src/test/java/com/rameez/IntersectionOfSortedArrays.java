package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/intersection-of-sorted-arrays/

public class IntersectionOfSortedArrays {

    /**
     * Given two sorted arrays, A and B, return a new sorted array of elements
     * that are common to both A and B.
     *
     * @param A the first sorted array
     * @param B the second sorted array
     * @return a new sorted array of elements common to both A and B
     */
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int ai = 0, bi = 0; ai < A.size() && bi < B.size(); ) {
            if (A.get(ai) < B.get(bi)) {
                ai++;
            } else if (A.get(ai) > B.get(bi)) {
                bi++;
            } else {
                result.add(A.get(ai));
                ai++;
                bi++;
            }
        }

        return result;
    }

    @Test
    public void main() {


    }
}