package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/longest-consecutive-sequence/




public class LongestConsecutiveSequence {

    // METHOD 1:
    public int longestConsecutive(final List<Integer> A) {
        if (A == null || A.size() == 0) {
            return 0;
        }

        int answer = 0;
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < A.size(); i++) {
            set.add(A.get(i));
        }

        int consecutiveLength = 1;
        int index = 0; // to simulate index based traversal.
        int prevElement = 0;
        for (int no : set) {
            if (index > 0) {// executes from the second element
                if (no == prevElement + 1) {
                    consecutiveLength++;
                } else if (no == prevElement) {
                    // when a value is repeated.
                } else {
                    answer = Math.max(consecutiveLength, answer);
                    consecutiveLength = 1;
                }
            }
            prevElement = no;
            index++;
        }

        return Math.max(consecutiveLength, answer);
    }

    @Test
    public void main() {
        assertEquals(5, longestConsecutive(List.of(6, 4, 5, 2, 3)));
    }
}