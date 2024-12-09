package com.rameez;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

// https://www.interviewbit.com/problems/amazing-subarrays/

public class AmazingSubarrays {

    public int solve(String A) {

        int answer = 0;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (vowels.contains(c)) {
                answer += A.length() - i;
            }
        }

        return answer % 10003;
    }

    @Test
    public void main() {
    }
}