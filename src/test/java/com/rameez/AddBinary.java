package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/add-binary/

class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder answer = new StringBuilder();
        String smallS = a.length() < b.length() ? a : b;
        String bigS = smallS.equals(a) == true ? b : a;
        int smallL = smallS.length();
        int bigL = bigS.length();

        int carry = 0;
        for (int i = 1; i <= smallL; i++) {

            int digit1 = Integer.parseInt(smallS.substring(smallL - i, smallL - i + 1));
            int digit2 = Integer.parseInt(bigS.substring(bigL - i, bigL - i + 1));
            int countOf1s = 0;
            if (digit1 == 1) {
                countOf1s++;
            }
            if (digit2 == 1) {
                countOf1s++;
            }
            if (carry == 1) {
                countOf1s++;
            }
            Integer res = countOf1s % 2;
            answer.append(res.toString());
            carry = (digit1 & digit2) | (digit2 & carry) | (carry & digit1);
        }

        if (smallS.length() == bigS.length()) {
            if (carry == 1) {
                answer.append("1");
            }
        } else {
            for (int i = bigL - smallL - 1; i >= 0; i--) {
                int digit = Integer.parseInt(bigS.substring(i, i + 1));
                Integer result = digit ^ carry;
                carry = carry & digit;
                answer.append(result.toString());
            }
            if (carry == 1) {
                answer.append("1");
            }
        }

        return answer.reverse().toString();
    }

    @Test
    void test() {
        assertEquals("10101", addBinary("1010", "1011"));
        assertEquals("110110", addBinary("100", "110010"));
        assertEquals("100", addBinary("11", "1"));
    }
}
