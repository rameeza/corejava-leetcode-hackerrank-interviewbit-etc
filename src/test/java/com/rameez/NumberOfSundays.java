package com.rameez;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/number-of-sundays/

public class NumberOfSundays {

    public int solve(String A, int B) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Sunday", 1);
        map.put("Monday", 7);
        map.put("Tuesday", 6);
        map.put("Wednesday", 5);
        map.put("Thursday", 4);
        map.put("Friday", 3);
        map.put("Saturday", 2);

        int daysRemainingForSunday = map.get(A);
        if (B < daysRemainingForSunday) {
            return 0;
        } else if (B == daysRemainingForSunday) {
            return 1;
        } else {
            return 1 + (B - daysRemainingForSunday) / 7;
        }

    }

    @Test
    public void main() {

        assertEquals(1, solve( "Sunday", 1));
        assertEquals(2, solve( "Monday", 14));
    }
}