package com.rameez;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/valid-password/

public class ValidPassword {


    public int solve(String A) {

        int answer = 1;

        if (!A.matches(".*[0-9].*"))
            answer = 0;

        if (!A.matches("^.{8,15}$"))
            answer = 0;

        if (!A.matches("^.*[a-z].*$"))
            answer = 0;

        if (!A.matches("^.*[A-Z].*$"))
            answer = 0;

        if (!A.matches("^.*[@#%&!$*].*$"))
            answer = 0;

        return answer;
    }


    @Test
    public void main() {
        assertEquals(1, solve("Scaler@1"));

    }
}