package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/fizz-buzz/
// https://www.interviewbit.com/problems/fizzbuzz/

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            if ((i % 15) == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(i + "");
            }
        }

        return answer;
    }

    @Test
    public void main() {

    }
}