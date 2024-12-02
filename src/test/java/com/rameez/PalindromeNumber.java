package com.rameez;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/palindrome-number/

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        // use long as test case is failing for large numbers
        long no = x;
        long reverseNo = 0;
        int powerOf10 = (x + "").length() - 1;

        while (no > 0) {
            int digit = (int) (no % 10);
            reverseNo += digit * Math.pow(10, powerOf10--);
            no = no / 10;
        }

        return (x == reverseNo);
    }

    @Test
    public void main() {
        assertEquals(false, isPalindrome(2147483647));
    }
}