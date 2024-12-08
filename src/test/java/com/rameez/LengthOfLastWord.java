package com.rameez;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/length-of-last-word
// https://www.interviewbit.com/problems/length-of-last-word/

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s.matches("\\s+")) {
            return 0;
        }
        String[] words = s.trim().split("\\s+");
        return (words[words.length - 1]).length();
    }


    // METHOD 2: WITHOUT USING STRING METHODS
    public int lengthOfLastWord2(final String A) {
        if (A.matches("\\s+")) {
            return 0;
        }

        int answer = 0;
        int index = -1;
        boolean started = false;
        for (int i = A.length() - 1; i >= 0; i--) {
            char c = A.charAt(i);
            if (c != ' ') {
                started = true;
                index = i;
                break;
            }
        }

        for (; index >= 0; index--) {
            char c = A.charAt(index);
            if (c == ' ') {
                break;
            }
            answer++;
        }

        return answer;
    }

    @Test
    public void main() {
    }
}