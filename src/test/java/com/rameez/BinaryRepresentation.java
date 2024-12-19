package com.rameez;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/binary-representation/

public class BinaryRepresentation {

    public String findDigitsInBinary(int A) {
        if (A == 0)
            return "0";

        StringBuilder answer = new StringBuilder();

        for (int i = 1; A > 0; i++) {
            int powOf2 = (int) Math.pow(2, i);
            Integer remainder = A % powOf2;
            if (remainder == 0) {
                answer.append("0");
            } else {
                answer.append("1");
                A = A - (int) Math.pow(2, i - 1);
            }
        }

        return answer.reverse().toString();
    }

    @Test
    public void main() {
        assertEquals("10", findDigitsInBinary(2));
    }
}