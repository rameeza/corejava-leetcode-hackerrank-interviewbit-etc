package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://www.interviewbit.com/problems/colorful-number/

public class ColorfulNumber {

    public int colorful(int A) {
        if (A == 0) {
            return 1;
        }

        Set<Integer> products = new HashSet<>();

        List<Integer> digits = new ArrayList<>();
        while (A > 0) {
            int digit = A % 10;
            digits.add(digit);
            A = A / 10;
        }

        for (int size = 1; size <= digits.size(); size++) {
            for (int i = 0; i <= digits.size() - size; i++) {
                int prod = 1;
                for (int x = 0; x < size; x++) {
                    prod *= digits.get(i + x);
                }
                if (products.contains(prod)) {
                    return 0;
                } else {
                    products.add(prod);
                }
            }
        }

        return 1;
    }

    @Test
    public void main() {

    }
}