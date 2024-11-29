package com.rameez;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/check-palindrome/

public class CheckPalindrome {

    /**
     * Checks if the given String can be converted to a palindrome String by rearranging it characters or not.
     * @param A the String that needs to be tested.
     * @return 1 when it can be converted to a palindrome, otherwise 0.
     */
    public int solve(String A) {
        int answer = 1;
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        if (set.size() > 1) {
            answer = 0;
        }

        return answer;
    }

    @Test
    public void main() {
        assertEquals(0, solve("abcde"));
        assertEquals(1, solve("abbaee"));
    }
}