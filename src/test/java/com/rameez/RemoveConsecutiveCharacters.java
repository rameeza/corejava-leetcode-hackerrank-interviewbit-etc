package com.rameez;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

// https://www.interviewbit.com/problems/remove-consecutive-characters/

public class RemoveConsecutiveCharacters {

    public String solve(String A, int B) {
        if (B > A.length()) {
            return A;
        }

        char prevC = A.charAt(0);
        int prevCCount = 0;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (c != prevC) {
                if (prevCCount != B) {
                    // append characters to the answer
                    for (int j = 1; j <= prevCCount; j++) {
                        answer.append(prevC);
                    }
                }
                prevC = c;
                prevCCount = 1;
            } else {
                prevCCount++;
            }
        }// loop ends

        if (prevCCount != B) {
            for (int j = 1; j <= prevCCount; j++) {
                answer.append(prevC);
            }
        }

        return answer.toString();
    }

    @Test
    public void main() {
    }
}