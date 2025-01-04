package com.rameez;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/integer-to-roman

public class IntegerToRoman {

    public String intToRoman(int num) {

        Map<Integer, String> map = new HashMap<>();
        map.put(4, "IV");
        map.put(9, "IX");
        map.put(40, "XL");
        map.put(90, "XC");
        map.put(400, "CD");
        map.put(900, "CM");

        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");

        int[] nosWithRomanSymbols = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder answer = new StringBuilder();
        for (int i = 0; (i < nosWithRomanSymbols.length) && (num > 0); i++) {
            int symbolNo = nosWithRomanSymbols[i];
            int count = num / symbolNo;

            if (map.containsKey(count * symbolNo)) {
                answer.append(map.get(count * symbolNo));
            } else {
                String s = map.get(symbolNo);
                for (int m = 1; m <= count; m++) {
                    answer.append(s);
                }
            }

            num -= (count * symbolNo);
        }

        return answer.toString();
    }

    @Test
    public void main() {

    }
}