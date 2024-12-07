package com.rameez;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/excel-sheet-column-number

public class ExcelSheetColumnNumber {

    public int titleToNumber(String columnTitle) {
        int answer = 0;
        int powerOf26 = 0;

        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            char c = columnTitle.charAt(i);
            answer += ((int) (c - 'A') + 1) * (Math.pow(26, powerOf26++));

        }
        return answer;
    }

    @Test
    public void main() {

    }
}