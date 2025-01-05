package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/string-to-integer-atoi/

public class StringToIntegerATOI {

    public int myAtoi(String s) {
        s = s.trim();

        if (s.length() == 0)
            return 0;

        boolean isNegative = false;
        if (s.charAt(0) == '-')
            isNegative = true;

        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((i > 0) && ((c == '+') || (c == '-'))) {
                break;
            }

            if ((c >= '0') && (c <= '9')) {
                int digit = c - '0';

                if ((answer > Integer.MAX_VALUE / 10) || ((answer == Integer.MAX_VALUE / 10) && (digit > Integer.MAX_VALUE % 10))) {
                    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                answer = (answer * 10) + digit;

            } else if ((c != '+') && (c != '-')) {
                break;
            }

        }
        return isNegative ? -answer : answer;
    }

    @Test
    public void main() {

    }
}