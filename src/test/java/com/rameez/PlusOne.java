package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/plus-one

public class PlusOne {

    public int[] plusOne(int[] digits) {
        boolean added = false;
        boolean carryforward = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = digits[i];
            if (digit < 9) {
                digits[i] = digits[i] + 1;
                added = true;
                break;
            } else {
                digits[i] = 0;
                if (i == 0) {
                    carryforward = true;
                }
            }
        }

        if (carryforward) {
            int[] answers = new int[digits.length + 1];
            answers[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                answers[i + 1] = digits[i];
            }
            return answers;
        } else {
            return digits;
        }

    }

    @Test
    public void main() {

    }
}