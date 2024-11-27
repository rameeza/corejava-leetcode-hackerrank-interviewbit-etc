package com.rameez;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/extracting-numbers/

public class ExtractingNumbers {


    public Long solve(String A) {
        // if no digit is present, return 0
        if (!A.matches("^.*[0-9]+.*$"))
            return 0L;

        Long answer = 0L;


        String[] numbers = A.replaceAll("[a-z]+", " ").trim().split(" ");

        for (int i = 0; i < numbers.length; i++) {
            answer += Integer.parseInt(numbers[i]);
        }

        return answer;
    }

    @Test
    public void main() {
//        assertEquals(solve("a12b34c"), 46L);


        solve("a12b34c");
        solve("abcde");
        solve("1000");
        solve("");
        solve(" ");
    }
}