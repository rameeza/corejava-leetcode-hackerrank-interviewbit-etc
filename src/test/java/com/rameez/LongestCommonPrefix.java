package com.rameez;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/longest-common-prefix/
// https://www.interviewbit.com/problems/longest-common-prefix

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] A) {

        Arrays.sort(A, ((x, y) -> {
            return x.length() - y.length();
        }));

        String answer = A[0];

        for (int i = 1; i < A.length; i++) {
            int length = answer.length();
            String str = A[i];
            String startingSubStr = str.substring(0, length);

            if (!answer.equals(startingSubStr)) {
                while (!answer.equals(startingSubStr)) {
                    answer = answer.substring(0, answer.length() - 1);
                    startingSubStr = startingSubStr.substring(0, startingSubStr.length() - 1);
                }
            }
        }

        return answer;
    }

    @Test
    public void main() {
    }
}