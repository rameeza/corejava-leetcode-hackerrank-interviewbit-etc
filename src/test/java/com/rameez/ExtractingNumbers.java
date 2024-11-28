package com.rameez;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/extracting-numbers/

// Both solve(Sting A) and solveUsingStingBuilder(String A) work fine.
public class ExtractingNumbers {


    public Long solve(String A) {
        // if no digit is present, return 0
        if (!A.matches("^.*[0-9]+.*$"))
            return 0L;

        Long answer = 0L;

        // get String array of numbers
        String[] numbers = A.replaceAll("[a-z]+", " ").trim().split(" ");

        for (int i = 0; i < numbers.length; i++) {
            answer += Integer.parseInt(numbers[i]);
        }
        return answer;
    }


    public Long solveUsingStringBuilder(String A) {
        Long answer = 0L;
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (c >= '0' && c <= '9') {
                sb.append(c);
            } else if (sb.length() > 0) {
                Integer no = Integer.parseInt(sb.toString());
                answer += no;
                sb = new StringBuilder("");
            }
        }
        if (sb.length() > 0) {
            Integer no = Integer.parseInt(sb.toString());
            answer += no;
            sb = new StringBuilder("");
        }
        return answer;
    }

    @Test
    public void main() {

        solve("a12b34c");
        solve("abcde");
        solve("1000");
        solve("");
        solve(" ");

        solveUsingStringBuilder("a12b34c");
        solveUsingStringBuilder("abcde");
        solveUsingStringBuilder("1000");
        solveUsingStringBuilder("");
        solveUsingStringBuilder(" ");
    }
}