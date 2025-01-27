package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        boolean answer = true;

        // changes "A man, a plan, a canal: Panama" to "amanaplanacanalpanama"
        s = s.toLowerCase().trim().replaceAll("[^a-z0-9]", "");
        if (s.length() <= 1) {
            return true;
        }

        int backIndex = s.length() - 1;
        for (int i = 0; i <= s.length() / 2; i++) {
            char c = s.charAt(i);
            char backC = s.charAt(backIndex--);
            if (c != backC) {
                answer = false;
                break;
            }
        }

        return answer;
    }

    @Test
    public void main() {
        assertEquals(isPalindrome("A man, a plan, a canal: Panama"), true);
    }
}