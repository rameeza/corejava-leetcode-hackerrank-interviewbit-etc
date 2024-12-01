package com.rameez;

import org.junit.Test;

import java.util.Arrays;

// https://www.interviewbit.com/problems/palindrome-string/

public class PalindromeString {

    public int isPalindrome(String A) {
        String strFront = A.toLowerCase().replaceAll("\\s", "").replaceAll("\\W", "");
        String StrReverse = new StringBuilder(strFront).reverse().toString();
        if (strFront.equals(StrReverse)) {
            return 1;
        } else {
            return 0;
        }
    }

    @Test
    public void main() {
    }
}